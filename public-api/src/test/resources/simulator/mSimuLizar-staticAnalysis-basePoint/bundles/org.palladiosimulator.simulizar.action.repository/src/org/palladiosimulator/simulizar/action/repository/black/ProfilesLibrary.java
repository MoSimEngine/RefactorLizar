package org.palladiosimulator.simulizar.action.repository.black;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.modelversioning.emfprofile.Profile;
import org.palladiosimulator.mdsdprofiles.api.ProfileAPI;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.identifier.Identifier;

public class ProfilesLibrary {

    public ProfilesLibrary() {
        super();
    }

    /**
     * Gets whether the stereotype with the given name is applied to the given pcm entity.
     * 
     * @param pcmEntity
     *            The {@link Entity} to be checked for stereotype application.
     * @param stereotypeName
     *            The name of the stereotype to check for application.
     * @return {@code true} whether the given stereotype is applied, {@code false} otherwise.
     */
    @Operation(kind = Kind.QUERY, contextual = true)
    public static boolean hasAppliedStereotype(final Entity pcmEntity, final String stereotypeName) {
        return StereotypeAPI.isStereotypeApplied(pcmEntity, stereotypeName);
    }

    /**
     * Gets whether the stereotype with the given name is applied to any of the given pcm entities.
     * 
     * @param pcmEntitySet
     *            A {@link Set} of pcm elements to be checked for stereotype application.
     * @param stereotypeName
     *            The name of the stereotype to check for application.
     * @return {@code true} whether the given stereotype is applied at least once, {@code false}
     *         otherwise.
     */
    public static boolean hasAppliedStereotype(final Set<Entity> pcmEntitySet, final String stereotypeName) {
        return StereotypeAPI.hasAppliedStereotype(pcmEntitySet, stereotypeName);
    }
    
    /**
     * Gets whether the stereotype with the given name is applied to the given pcm entity.
     * 
     * @param pcmEntity
     *            The {@link Entity} to be checked for stereotype application.
     * @param stereotypeName
     *            The name of the stereotype to check for application.
     * @return {@code true} whether the given stereotype is applied, {@code false} otherwise.
     */
    @Operation(kind = Kind.QUERY, contextual = true)
    public static boolean hasAppliedStereotype(final Identifier pcmIdentifier, final String stereotypeName) {
        return StereotypeAPI.isStereotypeApplied(pcmIdentifier, stereotypeName);
    }

    public static boolean appliedStereotypesEqualsOne(final Set<Entity> pcmEntitySet, final String stereotypeName) {
        return pcmEntitySet.stream().filter(e -> StereotypeAPI.isStereotypeApplied(e, stereotypeName)).count() == 1;
    }

    private static Optional<Profile> queryProfileByStereotypeName(Identifier pcmIdentifier, String stereotypeName) {
        assert stereotypeName != null && pcmIdentifier != null;

        return ProfileAPI.getApplicableProfiles().stream()
                .filter(profile -> profile.getStereotype(stereotypeName) != null).findAny();
    }

    private static void ensureProfileApplied(Resource resource, Profile profile) {
        assert resource != null && profile != null;

        if (!ProfileAPI.isProfileApplied(resource, profile)) {
            ProfileAPI.applyProfile(resource, profile);
        }
    }

    private static void ensureProfileApplied(Identifier pcmIdentifier, String stereotypeName) {
        assert pcmIdentifier != null && stereotypeName != null;

        Profile profile = queryProfileByStereotypeName(pcmIdentifier, stereotypeName)
                .orElseThrow(() -> new IllegalArgumentException(
                        "Stereotype with given name '" + stereotypeName + "' does not exist!"));
        ensureProfileApplied(pcmIdentifier.eResource(), profile);
    }

    /**
     * Applies the stereotype with the given name to the given pcm element.
     * 
     * @param pcmEntity
     *            The {@link Entity} the stereotype shall be applied to.
     * @param stereotypeName
     *            The name of the stereotype to apply.
     * @throws IllegalStateException
     *             In case no stereotype with the given name exists.
     */
    @Operation(kind = Kind.HELPER, contextual = true)
    public static void applyStereotype(final Entity pcmEntity, final String stereotypeName) {
        ensureProfileApplied(pcmEntity, stereotypeName);
        StereotypeAPI.applyStereotype(pcmEntity, stereotypeName);
    }
    
    /**
     * Applies the stereotype with the given name to the given pcm element.
     * 
     * @param pcmEntity
     *            The {@link Entity} the stereotype shall be applied to.
     * @param stereotypeName
     *            The name of the stereotype to apply.
     * @throws IllegalStateException
     *             In case no stereotype with the given name exists.
     */
    @Operation(kind = Kind.HELPER, contextual = true)
    public static void applyStereotype(final Identifier pcmIdentifier, final String stereotypeName) {
        ensureProfileApplied(pcmIdentifier, stereotypeName);
        StereotypeAPI.applyStereotype(pcmIdentifier, stereotypeName);
    }

    /**
     * Revokes the application of stereotype with the given name to the given pcm element.<br>
     * This method does nothing, in case the stereotype has not been applied beforehand.
     * 
     * @param pcmEntity
     *            The {@link Entity} that is affected.
     * @param stereotypeName
     *            The name of the stereotype to revoke.
     * @throws IllegalStateException
     *             In case no stereotype with the given name exists.
     */
    @Operation(kind = Kind.HELPER, contextual = true)
    public static void removeStereotypeApplications(final Entity pcmEntity, final String stereotypeName) {
        ensureProfileApplied(pcmEntity, stereotypeName);
        if (StereotypeAPI.isStereotypeApplied(pcmEntity, stereotypeName)) {
            StereotypeAPI.unapplyStereotype(pcmEntity, stereotypeName);
        }
    }
    
    /**
     * Revokes the application of stereotype with the given name to the given pcm element.<br>
     * This method does nothing, in case the stereotype has not been applied beforehand.
     * 
     * @param pcmEntity
     *            The {@link Entity} that is affected.
     * @param stereotypeName
     *            The name of the stereotype to revoke.
     * @throws IllegalStateException
     *             In case no stereotype with the given name exists.
     */
    @Operation(kind = Kind.HELPER, contextual = true)
    public static void removeStereotypeApplications(final Identifier pcmIdentifier, final String stereotypeName) {
        ensureProfileApplied(pcmIdentifier, stereotypeName);
        if (StereotypeAPI.isStereotypeApplied(pcmIdentifier, stereotypeName)) {
            StereotypeAPI.unapplyStereotype(pcmIdentifier, stereotypeName);
        }
    }

    /**
     * Sets the integer tagged value of a stereotype which is applied to the given pcm element.
     * 
     * @param pcmEntity
     *            The {@link Entity} that is affected.
     * @param value
     *            The new value to be set
     * @param stereotypeName
     *            The name of the stereotype the tagged value belongs to.
     * @param taggedValueName
     *            The name of the integer tagged value to be set.
     */
    public static void setTaggedValue(final Entity pcmEntity, final int value, final String stereotypeName,
            final String taggedValueName) {
        StereotypeAPI.setTaggedValue(pcmEntity, value, stereotypeName, taggedValueName);
    }

    public static int getIntTaggedValue(final Entity pcmEntity, final String taggedValueName,
            final String stereotypeName) {
        return (int) StereotypeAPI.getTaggedValue(pcmEntity, taggedValueName, stereotypeName);
    }

    public static double getDoubleTaggedValue(final Entity pcmEntity, final String taggedValueName,
            final String stereotypeName) {
        return (double) StereotypeAPI.getTaggedValue(pcmEntity, taggedValueName, stereotypeName);
    }

    public static void delete(final List<NamedElement> rootEObjects, final Entity eObject) {
        final Set<EObject> eObjects = new HashSet<EObject>();
        final Set<EObject> crossResourceEObjects = new HashSet<EObject>();
        eObjects.add(eObject);
        for (@SuppressWarnings("unchecked")
        final TreeIterator<InternalEObject> j = (TreeIterator<InternalEObject>) (TreeIterator<?>) eObject
                .eAllContents(); j.hasNext();) {
            final InternalEObject childEObject = j.next();
            if (childEObject.eDirectResource() != null) {
                crossResourceEObjects.add(childEObject);
            } else {
                eObjects.add(childEObject);
            }
        }

        Map<EObject, Collection<EStructuralFeature.Setting>> usages;
        usages = UsageCrossReferencer.findAll(eObjects, rootEObjects);

        for (final Map.Entry<EObject, Collection<EStructuralFeature.Setting>> entry : usages.entrySet()) {
            final EObject deletedEObject = entry.getKey();
            final Collection<EStructuralFeature.Setting> settings = entry.getValue();
            for (final EStructuralFeature.Setting setting : settings) {
                if (!eObjects.contains(setting.getEObject()) && setting.getEStructuralFeature().isChangeable()) {
                    EcoreUtil.remove(setting, deletedEObject);
                }
            }
        }

        EcoreUtil.remove(eObject);

        for (final EObject crossResourceEObject : crossResourceEObjects) {
            EcoreUtil.remove(crossResourceEObject.eContainer(), crossResourceEObject.eContainmentFeature(),
                    crossResourceEObject);
        }
    }
}

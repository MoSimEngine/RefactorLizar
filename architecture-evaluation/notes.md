### HyperEdges

From my current understanding a hyperedge is between methods, because each method is a node. [0]
A hyperedge should represent the call structure between.
A hyperEdge is a normal edge in method graph and simply added at multiple nodes. [1]
A edge is identified by caller and callee.[2]
`resolveBinding` returns a IMethodBinding [3]
A IMethodBinding is a MethodDeclaration
[1] https://github.com/rju/architecture-evaluation-tool/blob/9ddfe10eeb103054c824c1750e7b3389b9392f36/de.cau.cs.se.software.evaluation/src/de/cau/cs/se/software/evaluation/transformation/HypergraphCreationFactory.xtend#L110

[2] https://github.com/rju/architecture-evaluation-tool/blob/9ddfe10eeb103054c824c1750e7b3389b9392f36/de.cau.cs.se.software.evaluation.java/src/de/cau/cs/se/software/evaluation/java/transformation/JavaHypergraphElementFactory.xtend#L179

[3] https://www.ibm.com/docs/en/z-open-unit-test/2.0.x?topic=SSZHNR_2.0.0/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/MethodDeclaration.html

## Edges

Edges a represented by a cause element.
Source and target have the edge object as property[0]

[0] https://github.com/rju/architecture-evaluation-tool/blob/9ddfe10eeb103054c824c1750e7b3389b9392f36/de.cau.cs.se.software.evaluation/src/de/cau/cs/se/software/evaluation/transformation/HypergraphCreationFactory.xtend#L84


- ihm das Beispiel schreiben.
Es gibt eine System node, warum?

------------------------
Werden Kanten erstellen zum System_node?
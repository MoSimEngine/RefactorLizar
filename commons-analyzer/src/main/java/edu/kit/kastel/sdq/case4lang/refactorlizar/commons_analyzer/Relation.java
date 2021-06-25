/**
 * Copyright (c) 2021 DSiS – Dependability of Software-intensive Systems
 *
 * <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * <p>The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * SPDX-License-Identifier: MIT-Modern-Variant
 */
package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer;

import java.util.Collection;
import java.util.Objects;
import java.util.Set;

public class Relation<T, U> {

    private T source;
    private T target;
    private Set<U> causes;

    public Relation(T source, T target, Set<U> causes) {
        this.source = source;
        this.target = target;
        this.causes = causes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Relation)) {
            return false;
        }
        Relation<?, ?> relation = (Relation<?, ?>) o;
        return Objects.equals(source, relation.source)
                && Objects.equals(target, relation.target)
                && Objects.equals(causes, relation.causes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, target, causes);
    }

    @Override
    public String toString() {
        return "{"
                + " source='"
                + getSource()
                + "'"
                + ", target='"
                + getTarget()
                + "'"
                + ", causes='"
                + getCauses()
                + "'"
                + "}";
    }

    public T getSource() {
        return source;
    }

    public T getTarget() {
        return target;
    }

    public Collection<U> getCauses() {
        return causes;
    }
}

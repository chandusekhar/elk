/*******************************************************************************
 * Copyright (c) 2011, 2015 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Kiel University - initial API and implementation
 *******************************************************************************/
package org.eclipse.elk.alg.force.graph;

/**
 * A bend point of an edge in the force graph.
 * 
 * @author tmn
 * @author owo
 * @author msp
 */
public final class FBendpoint extends FParticle {
    
    /** the serial version UID. */
    private static final long serialVersionUID = -7146373072650467350L;
    
    /** The edge this bend point belongs to. */
    private FEdge edge;
    
    /**
     * Construct a new bend point on the given edge. The bend point is also put
     * into the edge's list of bend points.
     * 
     * @param edge the edge this bend point belongs to
     */
    public FBendpoint(final FEdge edge) {
        this.edge = edge;
        edge.getBendpoints().add(this);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        if (edge != null) {
            int index = edge.getBendpoints().indexOf(this);
            if (index >= 0) {
                return "b" + index + "[" + edge.toString() + "]";
            } else {
                return "b[" + edge.toString() + "]";
            }
        }
        return "b_" + hashCode();
    }
    
    /**
     * Returns the edge this bend point belongs to.
     * 
     * @return the corresponding edge
     */
    public FEdge getEdge() {
        return edge;
    }
    
}

package org.uml.visual.palette;

import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;

/**
 *
 * @author NUGS
 */
public class PaletteCategoryNode extends AbstractNode {

    public PaletteCategoryNode(PaletteCategory category) {
        super(Children.create(new PaletteItemChildFactory(category), true));
        setDisplayName(category.getName());
    }
}

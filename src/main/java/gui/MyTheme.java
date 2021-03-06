package gui;


import com.googlecode.lanterna.gui.Theme;
import com.googlecode.lanterna.terminal.Terminal.Color;

public class MyTheme extends Theme{

    private static final Definition DEFAULT = new Definition(Color.BLACK, Color.WHITE, false);
    private static final Definition SELECTED = new Definition(Color.WHITE, Color.BLACK, true);
	
    public MyTheme() {
        setDefinition(Category.DIALOG_AREA, new Definition(Color.BLACK, Color.WHITE, false));
        setDefinition(Category.SCREEN_BACKGROUND, new Definition(Color.CYAN, Color.BLACK, true));
        setDefinition(Category.SHADOW, new Definition(Color.BLACK, Color.BLACK, true));
        setDefinition(Category.BORDER, new Definition(Color.BLACK, Color.WHITE, true));
        setDefinition(Category.RAISED_BORDER, new Definition(Color.BLACK, Color.WHITE, true));
        setDefinition(Category.BUTTON_LABEL_ACTIVE, new Definition(Color.RED, Color.WHITE, true));
        setDefinition(Category.BUTTON_LABEL_INACTIVE, new Definition(Color.BLACK, Color.WHITE, true));
        setDefinition(Category.BUTTON_ACTIVE, new Definition(Color.RED, Color.WHITE, true));
        setDefinition(Category.BUTTON_INACTIVE, DEFAULT);
        setDefinition(Category.LIST_ITEM, DEFAULT);
        setDefinition(Category.LIST_ITEM_SELECTED, SELECTED);
        setDefinition(Category.CHECKBOX, DEFAULT);
        setDefinition(Category.CHECKBOX_SELECTED, SELECTED);
        setDefinition(Category.TEXTBOX, new Definition(Color.YELLOW, Color.BLACK, false));
        setDefinition(Category.TEXTBOX_FOCUSED, new Definition(Color.YELLOW, Color.BLUE, true));
        setDefinition(Category.PROGRESS_BAR_COMPLETED, new Definition(Color.GREEN, Color.BLACK, false));
        setDefinition(Category.PROGRESS_BAR_REMAINING, new Definition(Color.RED, Color.BLACK, false));
    }
	
}

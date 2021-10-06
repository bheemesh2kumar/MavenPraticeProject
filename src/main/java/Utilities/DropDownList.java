package Utilities;

import org.openqa.selenium.support.ui.Select;

public class DropDownList {

    Select Selectref;

    public DropDownList(Select Selectref) {
        this.Selectref = Selectref;
    }

    public void select(String text) {
        this.Selectref.selectByVisibleText(text);
    }

    public void select(int indnum) {
        this.Selectref.selectByIndex(indnum);
    }


}

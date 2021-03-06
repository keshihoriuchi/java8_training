package chapter4.ex08;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import org.junit.Test;
import org.loadui.testfx.GuiTest;
import static org.loadui.testfx.Assertions.*;

public class TextAndLabelTest extends GuiTest {

  @Test
  public void testTextAndLabel() {
    verifyThat("#label", (Label label) -> label.getText().equals("Hello, JavaFX"));
    click("#textField").push(KeyCode.CONTROL, KeyCode.A).push(KeyCode.BACK_SPACE).type("foo");
    verifyThat("#label", (Label label) -> label.getText().equals("foo"));
  }

  @Override
  protected Parent getRootNode() {
    return TextAndLabelApplication.getRoot();
  }
}
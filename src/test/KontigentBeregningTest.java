package test;
import enums.Gender;
import members.MemberCasual;
import menus.treasurerMenu.PaymentManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import register.Register;


public class KontigentBeregningTest {

    private MemberCasual memberCasual = new MemberCasual("jens", 16, "4214", Gender.MALE);
    @Test
    public void getExpectedQuota() {
        //Arrange
        int expected = 1000;
        //Act
        int actual = PaymentManager.getExpectedQuota(Register.getListOfMembers());
        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getActualQuota(){
        //Arrange
        int expected = 0;
        //Act
        int actual = PaymentManager.getActualQuota(Register.getListOfMembers());
        //Assert
        Assertions.assertEquals(expected, actual);
    }
}

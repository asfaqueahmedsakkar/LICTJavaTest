/**
 * Created by Sakkar on 2/8/2017.
 */
public class TestAbstactAndInterface {
    //using interface where is no override method
    public static void main(String[] args){
        InterfaceClass interfaceClass=new TestClass();
        System.out.print("Proect name :"+interfaceClass.projectName());

        TestAbstract testAbstract=new TestAbstract();
        testAbstract.setName("Abstract");
        System.out.print("Proect name :"+testAbstract.name());
    }
}

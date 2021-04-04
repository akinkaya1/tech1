package accessModifiers.package1.innerPackageOfPackage1;

import accessModifiers.package1.Computer;

public class TestInnerPackage extends Computer{
    public static void main(String[] args) {
        //Computer and Television objects can be created here but Projector cannot be

        Computer c = new Computer();
    }
}

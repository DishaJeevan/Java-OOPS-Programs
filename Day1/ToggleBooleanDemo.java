class ToggleBoolean{
    static boolean toggleUsingNot(boolean flag) {
        return !flag;
    }
    static boolean toggleUsingXor(boolean flag) {
        return flag ^ true;
    }
    static boolean toggleUsingTernary(boolean flag) {
        return flag ? false : true;
    }
    static boolean toggleUsingIf(boolean flag) {
        if (flag==true) {
            return false;
        } else {
            return true;
        }
    }
    static boolean toggleUsingSwitch(boolean flag) {
        switch (flag?1:0) {
            case 0:
                return false;
            case 1:
                return true;
            default:
               System.out.println("Invalid case");
               return flag; // Fallback to original value
        }
    }

}
public class ToggleBooleanDemo {
    public static void main(String[] args) {
        boolean Flag = true;

        System.out.println("Initial Flag: " + Flag);
        System.out.println("Toggle using NOT: " + ToggleBoolean.toggleUsingNot(Flag));
        System.out.println("Toggle using XOR: " + ToggleBoolean.toggleUsingXor(Flag));
        System.out.println("Toggle using Ternary: " + ToggleBoolean.toggleUsingTernary(Flag));
        System.out.println("Toggle using If: " + ToggleBoolean.toggleUsingIf(Flag));
        System.out.println("Toggle using Switch: " + ToggleBoolean.toggleUsingSwitch(Flag));
    }
}

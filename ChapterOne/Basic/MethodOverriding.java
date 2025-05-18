package Basic;

class One {
    public void MethodOne() {
        System.out.println("This is the Method One Class");
    }
}

class Two extends One {
    private String name;

    Two(String name) {
        this.name = name;
    }

    @Override
    public void MethodOne() {
        try {
            System.out.println(name);
            throw new Error("This is the erorr");
        } catch (Exception e) {
            System.out.println("error chaught" + e.getMessage());
        } finally {
            System.out.println("This is the Method Two class ");
        }
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Two a = new Two("Roshan RIjal");
        a.MethodOne();

        One b = new One();
        b.MethodOne();

    }

}

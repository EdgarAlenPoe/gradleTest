public abstract class Bad {
    public void heh(int i) {
        
    }

    public void bar() {
        int x = 2;
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
    }

    public int getX() {
        return 1;
    }
}

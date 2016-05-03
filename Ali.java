package inheritance;

public class Ali extends Manusia {
    int a = 1, b =2, c = a + b;
    
    @Override
    public void melihat() {
        System.out.println("Ali "+super.mata);
    }

    @Override
    public void lari() {
        super.lari(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void minum() {
        super.minum(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void makan() {
        super.makan(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void belajar() {
        System.out.println("Ali Belajar");
       
    }
    
    public void matematika() {
        System.out.println(c);
    }

    @Override
    public void sakit() {
        System.out.println("Ali"+super.sakit);
    }
    
}

package pckg_polymorph;

public class Tiger extends Animal{
    @Override
    public void makeSomeSound(){
        System.out.println(getClass().getSimpleName()+" is roaring!");
    }
}

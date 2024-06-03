package pckg_polymorph;

public class RubberTiger extends Animal{
    @Override
    public void makeSomeSound(){
        System.out.println(getClass().getSimpleName()+" is playing an artificial roar!");
    }
}

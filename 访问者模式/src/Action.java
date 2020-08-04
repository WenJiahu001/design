/**
 * @author WJH
 * @date 2020/8/4
 */
public abstract class Action {


    public void execute(Person person) {
        System.out.print(person.getClass() + person.getName() + "-");
        if (person instanceof Man)
            this.getManConclusion((Man) person);
        else if (person instanceof Woman)
            this.getWomanConclusion((Woman) person);
    }

    public abstract void getManConclusion(Man man);

    public abstract void getWomanConclusion(Woman women);
}


package cats;

/**
 *
 * @author Ashley
 */
public abstract class Cats {
    private String name;
    private int age;
    private int weight;
    public Cats(String name, int age, int weight)
    {
        System.out.println("Cat's information:");
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String toString()
    {
        return name + " " + age + " "+ weight;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public int getWeight()
    {
        return weight;
    } 
     public void setAge(int newAge)
     {
         age = newAge;
     }    
}

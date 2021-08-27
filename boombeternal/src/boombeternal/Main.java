package boombeternal;

class Entity {
    static int entityNumber = -1;
    protected int id;
    protected double x;
    protected double y;
    protected double health;

    Entity()
    {
        this.x = 0.0f;
        this.y = 0.0f;
        this.health = 0.0f;
        entityNumber++;
    }

    Entity(double x, double y, double health)
    {
        this.x = x;
        this.y = y;
        this.health = health;
        entityNumber++;
    }

    public void up(int steps) { this.y += steps; }
    public void down(int steps) { this.y -= steps; }
    public void left(int steps) { this.x -= steps; }
    public void right(int steps) { this.x += steps; }
    public boolean isDead(){ return (health <= 0.0f); }

}

class Player extends Entity
{
    private String name;
    private int bulletCount = 30;

    Player()
    {
        super();
        this.health = 100.0f;
        this.name = "Anonymous";
        this.id = entityNumber + 1;
    }

    Player(double x, double y, double health, String name)
    {
        super(x, y, health);
        this.name = name;
        this.id = entityNumber + 1;
    }

    //Getters and Setters
    public String getName() { return this.name; }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getBulletCount() { return this.bulletCount; }

    public void setBulletCount(int bulletCount)
    {
        this.bulletCount = bulletCount;
    }

    //Methods
    public void shoot(Entity target)
    {
        if(this.bulletCount == 0)
        {
            this.reload();
        }
        else
        {
            target.health -= 10.0;
        }
    }

    public void reload()
    {
        this.bulletCount = 30;
    }

    public String toString()
    {
        return  "ID: " + this.id + "\n" +
                "Name: " + this.name + "\n" +
                "Position: " + this.x + ", " + this.y + "\n" +
                "Health: " + this.health + "\n" +
                "Bullets: " + this.bulletCount + "\n" +
                "IsDead: " + this.isDead();
    }

}

class Monster extends Entity
{
    Monster()
    {
        super();
        this.health = 300.0f;
        this.id = entityNumber + 1;
    }

    Monster(double x, double y, double health)
    {
        super(x, y, health);
        this.id = entityNumber + 1;
    }

    void shoot(Entity target)
    {
        target.health -= 5.0f;
    }

    public String toString()
    {
        return  "ID: " + this.id + "\n" +
                "Position: " + this.x + ", " + this.y + "\n" +
                "Health: " + this.health + "\n" +
                "IsDead: " + this.isDead();
    }
}

public class Main {

    public static void main(String[] args) {
        //Game Testing

        Player Matthews = new Player(20.3, 40.3, 100.0, "Matthews");
        Monster Catherine = new Monster(30.0, 40.0, 300.0);
        Monster LadyDimitrascue = new Monster(60.0, 40.0, 900.0); //Boss fight hence 900 HP

        Matthews.left(60);
        Matthews.up(20);

        Catherine.shoot(Matthews);
        Matthews.shoot(LadyDimitrascue);
        Catherine.shoot(Matthews);
        LadyDimitrascue.shoot(Matthews);
        Catherine.up(30);
        Matthews.reload();

        //Intense battle. We will never know what will happen next.
        //But we can show their current status
        System.out.println(Catherine + "\n");
        System.out.println(LadyDimitrascue + "\n");
        System.out.println(Matthews + "\n");

    }
}

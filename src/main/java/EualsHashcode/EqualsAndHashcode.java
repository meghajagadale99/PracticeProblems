package EualsHashcode;

public
class EqualsAndHashcode {
    private int id;
    private String name;


    public
    EqualsAndHashcode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o){
        if(this==o) return true;
        if(o == null || getClass()!=o.getClass())  return false;
        EqualsAndHashcode equalsAndHashcode = (EqualsAndHashcode) o;
         return id == equalsAndHashcode.id && name.equals(equalsAndHashcode);
    }

    public static
    void main(String[] args) {
        EqualsAndHashcode equalsAndHashcode = new EqualsAndHashcode(1,"megha");
        EqualsAndHashcode equalsAndHashcode1 = new EqualsAndHashcode(1,"Megha");
    }
}

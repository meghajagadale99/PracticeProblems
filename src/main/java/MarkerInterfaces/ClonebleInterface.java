package MarkerInterfaces;

public
class ClonebleInterface {

    int employee_id;
    String employee_name;

    public
    ClonebleInterface(int employee_id, String employee_name) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
    }

    public static
    void main(String[] args) throws CloneNotSupportedException {
        ClonebleInterface clonebleInterface = new ClonebleInterface(1, "megha");

        ClonebleInterface cloneble = (ClonebleInterface) clonebleInterface.clone();
        System.out.println(cloneble.employee_id);
        System.out.println(cloneble.employee_name);
    }

    protected Object clone()
            throws CloneNotSupportedException
    {
        return super.clone();
    }

}

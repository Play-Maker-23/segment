public class testsegment {
    public static void main(String[] args) {
    Segment s = new Segment(Integer.parseInt(args[0]),
    Integer.parseInt(args[1]));
    int point;
    System.out.println("Longueur du " + s + " : " + s.longueur());
    point = Integer.parseInt(args[2]);
    if (s.appartient(point))
    System.out.println(point + " appartient au " + s);
    else
    System.out.println(point + " n'appartient pas au " + s);
    }
    }
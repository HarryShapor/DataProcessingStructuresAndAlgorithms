package laboratory4;

public class MainLaboratory4 {

    public static void main(String[] args) {

        laboratory4.UnidirectionalList<Integer> unidirectionalList = new laboratory4.UnidirectionalList<>(100);

        unidirectionalList.ins(50021);
        unidirectionalList.ins(500);
        unidirectionalList.ins(1232);
        unidirectionalList.ins(500);
        unidirectionalList.ins(500,2);
        unidirectionalList.ins(500);
        unidirectionalList.ins(1515);
        unidirectionalList.ins(141,3);
        unidirectionalList.ins(141);
        unidirectionalList.ins(141);
        unidirectionalList.ins(141);
        unidirectionalList.ins(141);
        unidirectionalList.ins(515100);
        unidirectionalList.ins(500);
        unidirectionalList.ins(500,10);
        unidirectionalList.ins(500);
        unidirectionalList.ins(5031310);
        unidirectionalList.ins(50);
        unidirectionalList.ins(500);
        System.out.println(unidirectionalList.toString());
        unidirectionalList.del(1);
        System.out.println(unidirectionalList.locate(500));
        System.out.println(unidirectionalList.ret(4));
        unidirectionalList.makeNull();
        System.out.println(unidirectionalList.toString());
    }
}

package part3.model;

public class CarDAO {
    // CRUD
    public void carInsert(CarDTO carDTO){
        System.out.println("DB에 저장 되었습니다.");
    }
    public void carSelect(){
        System.out.println("데이터를 불러왔습니다.");
    }
}

//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//
//public class ReflectionDemo {
//    public static void main(String[] args)
//            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Object object = new Car(); // object.ride는 안됨, 팔다리 접어서 들어감
////        object.ride();
//        Class carClass = Car.class;
//        Method ride = carClass.getMethod("ride");   // ride메소드 찾아봤는데 없는데?
//
//        ride.invoke(object, null);
////        Car car = new Car();
////        car.ride();
//    }
//}
//
//class Car {
//    public void ride(){
//        System.out.println("부릉부릉");
//    }
//}
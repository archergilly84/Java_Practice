public class FlowerPacker {
    //Big - 5kg Each
    //Small - 1kg Each
    //Goal - kg needed to make package
    public static boolean canPack (int bigCount, int smallCount, int goal ){
        if(bigCount < 0 || smallCount < 0 || goal < 0 || bigCount * 5 + smallCount < goal) return false;

        if(goal % 5 <= smallCount || bigCount * 5 == goal) return true;
        return false;
    }
}

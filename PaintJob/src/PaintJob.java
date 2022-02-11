public class PaintJob {

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0 ) return -1;
        double area = width * height;
        double numberOfBucketsNeeded = areaPerBucket * extraBuckets;
        return (int) Math.ceil((area - numberOfBucketsNeeded) / areaPerBucket);
    }

    public static int getBucketCount (double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 ) return -1;
        double area = width * height;
        double numberOfBucketsNeeded = area / areaPerBucket;
        return (int) Math.ceil(numberOfBucketsNeeded);
    }

    public static int getBucketCount (double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0 ) return -1;
        double numberOfBucketsNeeded = area / areaPerBucket;
        return (int) Math.ceil(numberOfBucketsNeeded);
    }
}

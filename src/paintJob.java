public class paintJob {
    public static void main(String[]  args){
        System.out.println(getBucketCount(2.15,3.14,1.4,2));
        System.out.println(getBucketCount(2.15,3.14,1.4));
        System.out.println(getBucketCount(2.15,1));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets){
        if(width<=0||height <=0|| areaPerBucket<=0||extraBuckets<0){
            return -1;
        }
        double area = width * height;
        double areaCoveredWithExtra = extraBuckets * areaPerBucket ;
        double remainingArea =   area - areaCoveredWithExtra;
        if(remainingArea <=0){
            return 0;
        }
        double leftBuckets = Math.ceil(remainingArea / areaPerBucket);
        int bucketRequired = (int) Math.ceil(leftBuckets);

        return bucketRequired;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0||height <=0|| areaPerBucket<=0){
            return -1;
        }
        double area = width*height;
        double numberOfBuckets = Math.ceil(area / areaPerBucket);
        return (int) numberOfBuckets;

    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0|| areaPerBucket<=0){
            return -1;
        }
        double numberOfBuckets = Math.ceil(area / areaPerBucket);

        return (int) numberOfBuckets;

    }

}
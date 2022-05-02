public class PaintJob {
    public static int getBucketCount (double width, double height, double areaPerBuckets, double extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBuckets <= 0 || extraBuckets <= 0) {
            return -1;
        }
        return (int) (Math.ceil((width * height / areaPerBuckets) - extraBuckets));
    }
    public static int getBucketCount (double area, double areaPerBuckets) {
        if (area <= 0 || areaPerBuckets <= 0) {
            return -1;
        }
        return (int) (Math.ceil(area / areaPerBuckets));
    }
}

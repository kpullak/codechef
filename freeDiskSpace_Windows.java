/* In Java old days, it lacks of method to determine the free disk space on a partition.
   But this is changed since JDK 1.6 released, a few new methods – getTotalSpace(), getUsableSpace()
   and getFreeSpace(), are bundled with java.io.File to retrieve the partition or disk space detail.
*/


import java.io.File;

public class DiskSpaceDetail
{
    public static void main(String[] args)
    {
    	File file = new File("c:");
    	long totalSpace = file.getTotalSpace(); //total disk space in bytes.
    	long usableSpace = file.getUsableSpace(); ///unallocated / free disk space in bytes.
    	long freeSpace = file.getFreeSpace(); //unallocated / free disk space in bytes.

    	System.out.println(" === Partition Detail ===");

    	System.out.println(" === bytes ===");
    	System.out.println("Total size : " + totalSpace + " bytes");
    	System.out.println("Space free : " + usableSpace + " bytes");
    	System.out.println("Space free : " + freeSpace + " bytes");

    	System.out.println(" === mega bytes ===");
    	System.out.println("Total size : " + totalSpace /1024 /1024 + " mb");
    	System.out.println("Space free : " + usableSpace /1024 /1024 + " mb");
    	System.out.println("Space free : " + freeSpace /1024 /1024 + " mb");
    }
}
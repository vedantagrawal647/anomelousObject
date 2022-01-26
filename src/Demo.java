/*
Q.In GLA University there is various department. It is asked to every dept to conduct meeting for all
the employees of GLA University. The central Management asked the dept kindly share starting time and
 ending time of the meeting in 24 hours format so that after verifying it will be circulated among the
  GLA employees.But there is a problem that before circulating the meeting information, the central
  management will find out if there are any clashes between time or not. If there are clashes it means
   the employee cannot attend all the meetings. Can you help central management to find it out
 */

import java.util.Arrays;
import java.util.Scanner;
class TimeInterval
{
    int start;
    int end;

    public TimeInterval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public static boolean canAttendMeeting(TimeInterval [ ] arr1) {
        int start[] = new int[5];
        int end[] = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            start[i] = arr1[i].start;
            end[i] = arr1[i].end;
        }
        Arrays.sort(start);
        Arrays.sort(end);

        for (int i = 0; i < start.length - 1; i++)
        {
            if(start[i+1]>end[i])
            {
                return true;
            }

        }
        return false;
    }

}
public class Demo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        TimeInterval[] arr=new TimeInterval[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=new TimeInterval(s.nextInt(),s.nextInt());
        }
        boolean b=TimeInterval.canAttendMeeting(arr);
        System.out.println(b);
    }
}
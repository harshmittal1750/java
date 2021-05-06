import java.io.*;

public class os {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        int choice = 0;
        int q = 0;
        System.out.println("Please enter the number of Processes: ");
        n = Integer.parseInt(br.readLine());
        System.out.println("Please choose the Algorithm to be applied:\n\t1. FCFS\n\t2. SRTF\n\t3. Round Robin");
        choice = Integer.parseInt(br.readLine());
        if (choice == 3)// We need Time Quantum only if Round Robin is chosen
        {
            System.out.println("Please enter the Time Quantum: ");
            q = Integer.parseInt(br.readLine());
        }
        int proc[][] = new int[n + 1][4];
        // proc[][0] is the AT array
        // proc[][1] is the BT array
        // proc[][2] is the WT array
        // proc[][3] is the TT array
        for (int i = 1; i <= n; i++) {
            if (choice == 2)// We need AT only for SRTF
            {
                System.out.println("Please enter the Arrival Time for Process " + i + ": ");
                proc[i][0] = Integer.parseInt(br.readLine());
            } else
                proc[i][0] = 0;
            System.out.println("Please enter the Burst Time for Process " + i + ": ");
            proc[i][1] = Integer.parseInt(br.readLine());
        }
        System.out.println();

        // Calculation of Total Time and Initialization of Time Chart array
        int total_time = 0;
        for (int i = 1; i <= n; i++) {
            total_time += proc[i][1];
        }
        int time_chart[] = new int[total_time];

        int sel_proc = 1;
        int current_q = 0;

        for (int i = 0; i < total_time; i++) {
            // Used only in SRTF
            if (choice == 2) {
                // Selection of shortest process which has arrived
                sel_proc = 0;
                int min = 99999;
                for (int j = 1; j <= n; j++) {
                    if (proc[j][0] <= i)// Condition to check if Process has arrived
                    {
                        if (proc[j][1] < min && proc[j][1] != 0) {
                            min = proc[j][1];
                            sel_proc = j;
                        }
                    }
                }
            }

            // Assign selected process to current time in the Chart
            time_chart[i] = sel_proc;

            // Decrement Remaining Time of selected process by 1 since it has been assigned
            // the CPU for 1 unit of time
            proc[sel_proc][1]--;

            // WT and TT Calculation
            for (int j = 1; j <= n; j++) {
                if (proc[j][0] <= i) {
                    if (proc[j][1] != 0) {
                        proc[j][3]++;// If process has arrived and it has not already completed execution its TT is
                                     // incremented by 1
                        if (j != sel_proc)// If the process has not been currently assigned the CPU and has arrived its
                                          // WT is incremented by 1
                            proc[j][2]++;
                    } else if (j == sel_proc)// This is a special case in which the process has been assigned CPU and
                                             // has completed its execution
                        proc[j][3]++;
                }
            }

            // Printing the Time Chart
            if (i != 0) {
                if (sel_proc != time_chart[i - 1])
                // If the CPU has been assigned to a different Process we need to print the
                // current value of time and the name of
                // the new Process
                {
                    System.out.print("--" + i + "--P" + sel_proc);
                }
            } else// If the current time is 0 i.e the printing has just started we need to print
                  // the name of the First selected Process
                System.out.print(i + "--P" + sel_proc);
            if (i == total_time - 1)// All the process names have been printed now we have to print the time at
                                    // which execution ends
                System.out.print("--" + (i + 1));

            // Used only in Round Robin
            if (choice == 3) {
                // Updating value of sel_proc for next iteration
                current_q++;
                if (current_q == q || proc[sel_proc][1] == 0)// If Time slice has expired or the current process has
                                                             // completed execution
                {
                    current_q = 0;
                    // This will select the next valid value for sel_proc
                    for (int j = 1; j <= n; j++) {
                        sel_proc++;
                        if (sel_proc == (n + 1))
                            sel_proc = 1;
                        if (proc[sel_proc][1] != 0)
                            break;
                    }
                }
            }

            // Used only in FCFS
            if (choice == 1) {
                // If current process has been completed we select the next process from the
                // list
                if (proc[sel_proc][1] == 0)
                    sel_proc++;
            }

        }
        System.out.println();
        System.out.println();

        // Printing the WT and TT for each Process
        System.out.println("P\t WT  \t TT  ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d\t%3dms\t%3dms", i, proc[i][2], proc[i][3]);
            System.out.println();
        }
        System.out.println();

        // Printing the average WT & TT
        float WT = 0, TT = 0;
        for (int i = 1; i <= n; i++) {
            WT += proc[i][2];
            TT += proc[i][3];
        }
        WT /= n;
        TT /= n;
        System.out.println("The Average WT is: " + WT + "ms");
        System.out.println("The Average TT is: " + TT + "ms");
    }

}
// output:-
// Please enter the number of Processes:
// 5
// Please choose the Algorithm to be applied:
// 1. FCFS
// 2. SRTF
// 3. Round Robin
// 2
// Please enter the Arrival Time for Process 1:
// 0
// Please enter the Burst Time for Process 1:
// 8
// Please enter the Arrival Time for Process 2:
// 1
// Please enter the Burst Time for Process 2:
// 4
// Please enter the Arrival Time for Process 3:
// 2
// Please enter the Burst Time for Process 3:
// 9
// Please enter the Arrival Time for Process 4:
// 3
// Please enter the Burst Time for Process 4:
// 5
// Please enter the Arrival Time for Process 5:
// 3
// Please enter the Burst Time for Process 5:
// 9

// 0--P1--1--P2--5--P4--10--P1--17--P3--26--P5--35

// P WT TT
// 1 9ms 17ms
// 2 0ms 4ms
// 3 15ms 24ms
// 4 2ms 7ms
// 5 23ms 32ms

// The Average WT is: 9.8ms
// The Average TT is: 16.8ms
// --------------------------------

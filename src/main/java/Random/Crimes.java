package Random;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static Random.TestUSCrime.USCrimeFile.CrimeMenu.CrimeMethods.*;

class TestUSCrime

{

    static Scanner input = new Scanner(System.in);

    static Scanner inputyear = new Scanner(System.in);

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

    private static DecimalFormat df3 = new DecimalFormat("###,###");

    public static void main(String[] args) throws IOException {

        //paste your path into the string literal below for the csv file

        String path = "";
        USCrimeFile.USCrime[] data = USCrimeFile.read(path);
        long startTime = System.currentTimeMillis();
        long endTime;
        int userSelect;
         int yearinput;
        System.out.println("\n");

        System.out.println("****************************");

        System.out.println("*    U.S. Crime Stastics    *");

        System.out.println("****************************");

        LocalDateTime now = LocalDateTime.now();

        System.out.println("Local Computer Date/Time: " + dtf.format(now));

        System.out.println();

        System.out.println();

        System.out.println("This Java application will provide the user access");

        System.out.println("to various U.S. Crime statistics compiled from 1994 to 2013");

        System.out.println("by the Federal Bureau of Investigation.\n\n");
        while (true)

        {

            System.out.print(USCrimeFile.CrimeMenu.getCrimeMenu());

            userSelect = input.nextInt();

            System.out.println();

            switch (userSelect)

            {

                case 1:

                    USCrimeFile.CrimeMenu.CrimeMethods.disPopPct(data);

                    break;

                case 2:

                    System.out.println("The highest Murder rate was " + USCrimeFile.CrimeMenu.CrimeMethods.maxMurRte(data) + " per 100,000 inhabitants in the year " + maxMurRteYr(data) + ".");

                    break;

                case 3:

                    System.out.println("The lowest Murder rate was " + USCrimeFile.CrimeMenu.CrimeMethods.minMurRte(data) + " per 100,000 inhabitants in the year " + minMurRteYr(data) + ".");

                    break;

                case 4:

                    System.out.println("The highest Robbery rate was " + USCrimeFile.CrimeMenu.CrimeMethods.maxRobRte(data) + " per 100,000 inhabitants in the year " + maxRobRteYr(data) + ".");

                    break;

                case 5:

                    System.out.println("The lowest Robbery rate was " + USCrimeFile.CrimeMenu.CrimeMethods.minRobRte(data) + " per 100,000 inhabitants in the year " + minRobRteYr(data) + ".");

                    break;

                case 6:

                    System.out.println("The lowest Burglary rate was " + minBurRte(data) + " per 100,000 inhabitants in the year " + minBurRteYr(data) + ".");

                    System.out.println("The highest Burglary rate was " + USCrimeFile.CrimeMenu.CrimeMethods.maxBurRte(data) + " per 100,000 inhabitants in the year " + maxBurRteYr(data) + ".");

                    break;

                case 7:

                    System.out.println("The lowest Rape rate was " + minRapRte(data) + " per 100,000 inhabitants in the year " + minRapRteYr(data) + ".");

                    System.out.println("The highest Rape rate was " + maxRapRte(data) + " per 100,000 inhabitants in the year " + maxRapRteYr(data) + ".");

                    break;

                case 8:

                    System.out.print("Enter year between 1994 and 2013: ");

                    yearinput = inputyear.nextInt();
                     int year = yearinput;
                    System.out.println();

                    if (year< 1994 || year > 2013)

                    {

                        do

                        {

                            System.out.println("Error: Year must between 1994 and 2013 inclusive.");

                            System.out.print("Please try again : ");

                           yearinput = inputyear.nextInt();
                        }

                        while (year < 1994 || year > 2013);

                    }

                    for (USCrimeFile.USCrime data1 : data)

                    {

                        if (year == data1.getYear())

                        {

                            System.out.println("\nThe U.S. population in " + data1.getYear() + " was " + df3.format(data1.getPopulation()) + " inhabitants.");

                        }

                    }

                    break;

                case 0:

                    endTime = System.currentTimeMillis();

                    System.out.println("\nThe elapsed time using this application was " + (endTime - startTime) / 1000 + " seconds.");

                    System.out.println("\nThank you for trying the US Crimes Statistics application.");

                    System.exit(0);

                default:

                    System.out.println("Error: Invalid selection! Please Try again.\n");

                    break;

            }

        }

    }


    public static class USCrimeFile

    {

        public static USCrime[] read(String filename) throws IOException

        {

            // Array Declaration

            USCrime[] stats = new USCrime[20];
            // Variable Declaration
            int count = 0;
            String line;

            // Read File

            try

            {

                Scanner inputReader;

                inputReader = new Scanner(new File(filename));

                inputReader.nextLine();

                while (inputReader.hasNext()) {
                    line = inputReader.nextLine();

                    String[] data = line.split(",");

                    stats[count] = new USCrime(Integer.parseInt(data[0]));    // US Crime Year from file

                    stats[count].setPopulation(Integer.parseInt(data[1]));    // US Population from file

                    stats[count].setMurderRate(Float.parseFloat(data[5]));    // US Crime Murder Rate from file

                    stats[count].setRobberyRate(Float.parseFloat(data[9]));    // US Crime Robbery Rate from file

                    stats[count].setBurglaryRate(Float.parseFloat(data[15]));    // US Crime Burglary Rate from file

                    stats[count].setRapeRate(Float.parseFloat(data[7]));    // US Crime Rape Rate from file

                    count++;





                }

            } catch (FileNotFoundException e) {
                System.out.println("\nError: You must enter a file name argument at program startup,");

                System.out.println("e.g. C:>java TestCrime Crime.csv");

                System.out.println("\nPlease re-run the application with a file name argument.");

                System.exit(0);

            }

            return stats;
        }


        public static class USCrime {

            private float mRate;

            private float rRate;

            private int pCrime;

            private int population;

            private int year;

            private float bRate;

            private float rpRate;

            // Constructor

            public USCrime(int year)

            {

                this.year = year;

            }

            // Getters

            public float getMurderRate()

            {

                return mRate;

            }

            public float getRobberyRate()

            {

                return rRate;

            }

            public int getPopulation()

            {

                return population;

            }

            public int getYear()

            {

                return year;

            }

            public float getBurglaryRate()

            {

                return bRate;

            }

            public float getRapeRate()

            {

                return rpRate;

            }

            // Setters

            public void setMurderRate(float mRate)

            {

                this.mRate = mRate;

            }

            public void setRobberyRate(float rRate)

            {

                this.rRate = rRate;

            }

            public void setPopulation(int population)

            {

                this.population = population;

            }

            public void setBurglaryRate(float bRate)

            {

                this.bRate = bRate;

            }

            public void setRapeRate(float rpRate)

            {

                this.rpRate = rpRate;

            }

        }


        public static class CrimeMenu

        {

            public static String getCrimeMenu()

            {

                //instantiate and read menu into string variable

                String menu = "\n" + "Select question number. Enter '0' to quit the program:\n" +

                        "1. What were the percentages in population growth for each consecutive year from 1994 - 2013?\n" +

                        "2. What year was the Murder rate the highest?\n" +

                        "3. What year was the Murder rate the lowest?\n" +

                        "4. What year was the Robbery rate the highest?\n" +

                        "5. What year was the Robbery rate the lowest?\n" +

                        "6. Which years were the Burglary rate the highest and lowest?\n" +

                        "7. Which years were the Rape rate the highest and lowest?\n" +

                        "8. What was the population in a particular year?\n" +

                        "Q. Quit the program\n" +

                        "Enter your selection: ";

                return menu;

            }


            public static class CrimeMethods

            {

                // Highets Murder Rate Method

                public static int maxMurRteYr(USCrime[] data)

                {

                    int year = 0;

                    float maxRte = 0;

                    for (USCrime crime : data)

                    {

                        if (crime.getMurderRate() > maxRte)

                        {

                            maxRte = crime.getMurderRate();

                            year = crime.getYear();

                        }

                    }

                    return year;

                }

                public static float maxMurRte(USCrime[] data)

                {

                    int year = 0;

                    float maxRte = 0;

                    for (USCrime crime : data)

                    {

                        if (crime.getMurderRate() > maxRte)

                        {

                            maxRte = crime.getMurderRate();

                            year = crime.getYear();

                        }

                    }

                    return maxRte;

                }


                // Lowest Murder Rate Method

                public static int minMurRteYr(USCrime[] data)

                {

                    int year = 0;

                    float minRte = data[0].getMurderRate();

                    for (USCrime crime : data)

                    {

                        if (crime.getMurderRate() < minRte)

                        {

                            minRte = crime.getMurderRate();

                            year = crime.getYear();

                        }

                    }

                    return year;

                }

                public static float minMurRte(USCrime[] data)

                {

                    int year = 0;

                    float minRte = data[0].getMurderRate();

                    for (USCrime crime : data)

                    {

                        if (crime.getMurderRate() < minRte)

                        {

                            minRte = crime.getMurderRate();

                            year = crime.getYear();

                        }

                    }

                    return minRte;

                }


                // Highest Robbery Rate Method

                public static int maxRobRteYr(USCrime[] data)

                {

                    int year = 0;

                    float maxRte1 = 0;

                    for (USCrime crime : data)

                    {

                        if (crime.getRobberyRate() > maxRte1)

                        {

                            maxRte1 = crime.getRobberyRate();

                            year = crime.getYear();

                        }

                    }

                    return year;

                }

                public static float maxRobRte(USCrime[] data)

                {

                    int year = 0;

                    float maxRte1 = 0;

                    for (USCrime crime : data)

                    {

                        if (crime.getRobberyRate() > maxRte1)

                        {

                            maxRte1 = crime.getRobberyRate();

                            year = crime.getYear();

                        }

                    }

                    return maxRte1;

                }


                // Lowest Robbery Rate Method

                public static int minRobRteYr(USCrime[] data)

                {

                    int year = 0;

                    float minRte1 = data[0].getRobberyRate();

                    for (USCrime crime : data)

                    {

                        if (crime.getRobberyRate() < minRte1)

                        {

                            minRte1 = crime.getRobberyRate();

                            year = crime.getYear();

                        }

                    }

                    return year;

                }

                public static float minRobRte(USCrime[] data)

                {

                    int year = 0;

                    float minRte1 = data[0].getRobberyRate();

                    for (USCrime crime : data)

                    {

                        if (crime.getRobberyRate() < minRte1)

                        {

                            minRte1 = crime.getRobberyRate();

                            year = crime.getYear();

                        }

                    }

                    return minRte1;

                }


                // Highest Burglary Rate Method

                public static int maxBurRteYr(USCrime[] data)

                {

                    int year = 0;

                    float maxRte2 = 0;

                    for (USCrime crime : data)

                    {

                        if (crime.getBurglaryRate() > maxRte2)

                        {

                            maxRte2 = crime.getBurglaryRate();

                            year = crime.getYear();

                        }

                    }

                    return year;

                }

                public static float maxBurRte(USCrime[] data)

                {

                    int year = 0;

                    float maxRte2 = 0;

                    for (USCrime crime : data)

                    {

                        if (crime.getBurglaryRate() > maxRte2)

                        {

                            maxRte2 = crime.getBurglaryRate();

                            year = crime.getYear();

                        }

                    }

                    return maxRte2;

                }


                // Lowest Robbery Rate Method

                public static int minBurRteYr(USCrime[] data)

                {

                    int year = 0;

                    float minRte2 = data[0].getBurglaryRate();

                    for (USCrime crime : data)

                    {

                        if (crime.getBurglaryRate() < minRte2)

                        {

                            minRte2 = crime.getBurglaryRate();

                            year = crime.getYear();

                        }

                    }

                    return year;

                }

                public static float minBurRte(USCrime[] data)

                {

                    int year = 0;

                    float minRte2 = data[0].getBurglaryRate();

                    for (USCrime crime : data)

                    {

                        if (crime.getBurglaryRate() < minRte2)

                        {

                            minRte2 = crime.getBurglaryRate();

                            year = crime.getYear();

                        }

                    }

                    return minRte2;

                }


                // Highest Rape Rate Method

                public static int maxRapRteYr(USCrime[] data)

                {

                    int year = 0;

                    float maxRte3 = 0;

                    for (USCrime crime : data)

                    {

                        if (crime.getRapeRate() > maxRte3)

                        {

                            maxRte3 = crime.getRapeRate();

                            year = crime.getYear();

                        }

                    }

                    return year;

                }

                public static float maxRapRte(USCrime[] data)

                {

                    int year = 0;

                    float maxRte3 = 0;

                    for (USCrime crime : data)

                    {

                        if (crime.getRapeRate() > maxRte3)

                        {

                            maxRte3 = crime.getRapeRate();

                            year = crime.getYear();

                        }

                    }

                    return maxRte3;

                }


                // Lowest Rape Rate Method

                public static int minRapRteYr(USCrime[] data)

                {

                    int year = 0;

                    float minRte3 = data[0].getRapeRate();

                    for (USCrime crime : data)

                    {

                        if (crime.getRapeRate() < minRte3)

                        {

                            minRte3 = crime.getRapeRate();

                            year = crime.getYear();

                        }

                    }

                    return year;

                }

                public static float minRapRte(USCrime[] data)

                {

                    int year = 0;

                    float minRte3 = data[0].getRapeRate();

                    for (USCrime crime : data)

                    {

                        if (crime.getRapeRate() < minRte3)

                        {

                            minRte3 = crime.getRapeRate();

                            year = crime.getYear();

                        }

                    }

                    return minRte3;

                }


                // Population Growth Rate Method

                public static void disPopPct(USCrime[] data)

                {

                    float growRte;

                    System.out.println("Population Growth Year to Year");

                    System.out.println("------------------------------");

                    for (int i = 0; i < data.length - 1; i++) {

                        growRte = 100 * (float) (data[i + 1].getPopulation() - data[i].getPopulation()) / data[i].getPopulation();

                        System.out.println("From " + data[i].getYear() + " to " + data[i + 1].getYear() + " the population growth was "

                                + String.format("%.4f", growRte) + "%.");

                    }

                }
            }
        }
    }
}






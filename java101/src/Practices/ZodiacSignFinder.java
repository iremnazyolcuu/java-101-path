package Practices;

import java.util.Scanner;

public class ZodiacSignFinder {

    public static void main(String[] args) {

        int day, month;
        String zodiacSign = "";
        Boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the day of your birth (1-12): ");
        day = input.nextInt();

        System.out.print("Enter the month of your birth (1-31): ");
        month = input.nextInt();

        if (1 <= month && month <= 12) {
            if (month == 1) {
                if (1 <= day && day <= 31) {
                    if (day <= 21) {
                        zodiacSign = "Capricorn";
                    } else {
                        zodiacSign = "Aquarius";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 2) {
                if (1 <= month && month <= 28) {
                    if (day <= 19) {
                        zodiacSign = "Aquarius";
                    } else {
                        zodiacSign = "Pisces";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 3) {
                if (1 <= month && month <= 31) {
                    if (day <= 20) {
                        zodiacSign = "Pisces";
                    } else {
                        zodiacSign = "Aries";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 4) {
                if (1 <= day && day <= 30) {
                    if (day <= 20) {
                        zodiacSign = "Aries";
                    } else {
                        zodiacSign = "Taurus";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 5) {
                if (1 <= day && day <= 31) {
                    if (day <= 20) {
                        zodiacSign = "Taurus";
                    } else {
                        zodiacSign = "Gemini";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 6) {
                if (1 <= day && day <= 31) {
                    if (day <= 22) {
                        zodiacSign = "Gemini";
                    } else {
                        zodiacSign = "Cancer";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 7) {
                if (1 <= day && day <= 31) {
                    if (day <= 22) {
                        zodiacSign = "Cancer";
                    } else {
                        zodiacSign = "Leo";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 8) {
                if (1 <= day && day <= 31) {
                    if (day <= 22) {
                        zodiacSign = "Leo";
                    } else {
                        zodiacSign = "Virgo";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 9) {
                if (1 <= day && day <= 31) {
                    if (day <= 22) {
                        zodiacSign = "Virgo";
                    } else {
                        zodiacSign = "Libra";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 10) {
                if (1 <= day && day <= 31) {
                    if (day <= 21) {
                        zodiacSign = "Libra";
                    } else {
                        zodiacSign = "Scorpio";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 11) {
                if (1 <= day && day <= 31) {
                    if (day <= 21) {
                        zodiacSign = "Scorpio";
                    } else {
                        zodiacSign = "Sagittarius";
                    }
                } else {
                    isError = true;
                }
            } else {
                if (1 <= day && day <= 31) {
                    if (day <= 21) {
                        zodiacSign = "Sagittarius";
                    } else {
                        zodiacSign = "Capricorn";
                    }
                } else {
                    isError = true;
                }
            }

        } else {
            System.out.println("Enter a valid month!");
        }

        if (isError == true) {
            System.out.println("Enter a valid day!");
        } else {
            System.out.println("Your zodiac sign is: " + zodiacSign);
        }
    }
}

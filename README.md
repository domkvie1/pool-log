# Pool Chemical Log

A Java command-line program that records pool chemical readings and flags unsafe ones.
Built from my experience as a head lifeguard and pool operator.

## What it does
- Takes a date, pH, and free chlorine for each reading
- Flags readings outside the safe range (pH 7.2-7.8, free chlorine 1.0-3.0 ppm)
- Prints a summary of all readings and the out-of-range ones
- Saves readings to a file so they persist between runs

## Concepts used
Classes and objects, constructors, ArrayList, Scanner input, loops, boolean logic, File I/O, try/catch, String.split, Double.parseDouble

## Next steps
- Store readings in a SQLite database
- Track combined chlorine and support spa/hot tub ranges

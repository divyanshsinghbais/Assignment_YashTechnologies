function p9() {
  // Get the current date
    let today = new Date();
  
    // Get the year of the current date
    let christmasYear = today.getFullYear();
  
    // Check if the current date is
    // already past by checking if the month
    // is December and the current day
    // is greater than 25
    if (today.getMonth() == 11 &&
        today.getDate() > 25) {
  
      // Add an year so that the next
      // Christmas date could be used
      christmasYear = christmasYear + 1;
    }
  
    // Get the date of the next Christmas
    let christmasDate = 
        new Date(christmasYear, 11, 25);
  
    // Get the number of milliseconds in 1 day
    let dayMilliseconds =
        1000 * 60 * 60 * 24;
  
    // Get the remaining amount of days
    let remainingDays = Math.ceil(
      (christmasDate.getTime() - today.getTime()) /
      (dayMilliseconds)
    );
  
    // Write it to the page
    document.write("There are " + remainingDays +
                   " days remaining until Christmas.");
}
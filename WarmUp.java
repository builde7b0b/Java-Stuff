
SLeepIn
Problem: 
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

Problem Code: 
public boolean sleepIn(boolean weekday, boolean vacation) {

}


Solution:
public boolean sleepIn(boolean weekday, boolean vacation) {
  if (!weekday || vacation) {
    return true;
  }

return false;

// Solution notes: better to write "vacation" than "vacation == true"
// thouch they mean exactly the same thing.
// Like wise "!weekday is better than "weekday == false".
// Here we just put the return-false lalst, or could use an if/else.
}




We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.


Public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

}


Solution:
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if (aSmile && bSmile) {
    return true;
  }
  if (!aSmile && !bSmile) {
    return true;
}
return false;
// the above can be shortened to:
// return ((aSmile && bSmile) || (!aSmile && !bSmile));
// or this very short version (think about how this is the same as the above)
// return (aSMile == bSmile);
}

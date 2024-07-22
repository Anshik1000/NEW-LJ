package assignment1;

public class Supply {
private int code;
private String foodName;
private String sticker;
private String foodType;

String GetType(String sticker) {
	String lowerSticker = sticker.toLowerCase();
	switch(lowerSticker) {
	case "green":
		return"Vegeterian";
	case "yellow":
		return "Contains Egg";
	case "red":
		return "Non Vegetarian";
	default:
		return "Not available";
		}

}

void FoodIn(int code,String foodName,String sticker) {
	this.code=code;
	this.foodName=foodName;
	this.sticker=sticker;
	this.foodType = GetType(sticker);
	
}
String FoodOUt() {
	String Food= toString();
	return Food;
}

@Override
public String toString() {
	return "code:" + code + ", foodName:" + foodName + ", sticker:" + sticker + ", foodType:" + foodType;
}
}
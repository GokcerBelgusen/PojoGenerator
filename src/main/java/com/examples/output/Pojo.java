package com.examples.output;
public class Pojo {
		private String DateTime = "DateTime";
		private String Year = "Year";
		private String Month = "Month";
		private String Day = "Day";
		private String DataQuality = "DataQuality";
		private String MaxTemp = "MaxTemp";
		private String MaxTempFlag = "MaxTempFlag";
		private String MinTemp = "MinTemp";
		private String MinTempFlag = "MinTempFlag";

		public String  getDateTime(){
			return this.DateTime;
		}
		public void  setDateTime(String DateTime){
			 this.DateTime = DateTime;
		}

		public String  getYear(){
			return this.Year;
		}
		public void  setYear(String Year){
			 this.Year = Year;
		}

		public String  getMonth(){
			return this.Month;
		}
		public void  setMonth(String Month){
			 this.Month = Month;
		}

		public String  getDay(){
			return this.Day;
		}
		public void  setDay(String Day){
			 this.Day = Day;
		}

		public String  getDataQuality(){
			return this.DataQuality;
		}
		public void  setDataQuality(String DataQuality){
			 this.DataQuality = DataQuality;
		}

		public String  getMaxTemp(){
			return this.MaxTemp;
		}
		public void  setMaxTemp(String MaxTemp){
			 this.MaxTemp = MaxTemp;
		}

		public String  getMaxTempFlag(){
			return this.MaxTempFlag;
		}
		public void  setMaxTempFlag(String MaxTempFlag){
			 this.MaxTempFlag = MaxTempFlag;
		}

		public String  getMinTemp(){
			return this.MinTemp;
		}
		public void  setMinTemp(String MinTemp){
			 this.MinTemp = MinTemp;
		}

		public String  getMinTempFlag(){
			return this.MinTempFlag;
		}
		public void  setMinTempFlag(String MinTempFlag){
			 this.MinTempFlag = MinTempFlag;
		}

// toString() Method
		 public String toString(){
			 return "{\"DateTime\"="+DateTime+",\"Year\"="+Year+",\"Month\"="+Month+",\"Day\"="+Day+",\"DataQuality\"="+DataQuality+",\"MaxTemp\"="+MaxTemp+",\"MaxTempFlag\"="+MaxTempFlag+",\"MinTemp\"="+MinTemp+",\"MinTempFlag\"="+MinTempFlag+"}";
		}
}

package hibernate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name="STUDENT_MARKS")
public class Student_marks {

		@Id @GeneratedValue(strategy=GenerationType.AUTO)
		private int student_id;

		private String CS401;
		private String CS402;
		private String CS403;
		private String PL405;
		private String PL406;
		
		public int getStudent_id() {
			return student_id;
		}
		public void setStudent_id(int student_id) {
			this.student_id = student_id;
		}
		
		public String getCS401() {
			return CS401;
		}
		public void setCS401(String cS401) {
			CS401 = cS401;
		}
		public String getCS402() {
			return CS402;
		}
		public void setCS402(String cS402) {
			CS402 = cS402;
		}
		public String getCS403() {
			return CS403;
		}
		public void setCS403(String cS403) {
			CS403 = cS403;
		}
		public String getPL405() {
			return PL405;
		}
		public void setPL405(String pL405) {
			PL405 = pL405;
		}
		public String getPL406() {
			return PL406;
		}
		public void setPL406(String pL406) {
			PL406 = pL406;
		}

}
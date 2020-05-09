package org.my.test_02;
	import org.junit.*;
import org.my.examples_02.Answer;
import org.my.examples_02.Bool;
import org.my.examples_02.BooleanQuestion;
import org.my.examples_02.Criteria;
import org.my.examples_02.Criterion;
import org.my.examples_02.Profile;
import org.my.examples_02.Question;
import org.my.examples_02.Weight;

public class ProfileTest {

   @Test
   public void test() {
      Profile profile = new Profile("Bull Hockey, Inc.");
      Question question = new BooleanQuestion(1, "Got bonuses?");
      Criteria criteria = new Criteria();
      Answer criteriaAnswer = new Answer(question, Bool.TRUE);
      Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch);
      criteria.add(criterion);
   }
}

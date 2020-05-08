package org.my.test;
	import org.junit.*;
	import org.my.examples.Answer;
	import org.my.examples.Bool;
	import org.my.examples.BooleanQuestion;
	import org.my.examples.Criteria;
	import org.my.examples.Criterion;
	import org.my.examples.Profile;
	import org.my.examples.Question;
	import org.my.examples.Weight;

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

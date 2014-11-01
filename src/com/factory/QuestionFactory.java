package com.factory;

import com.model.MetalConversionQuestion;
import com.model.Question;
import com.model.UnitConversionQuestion;
import com.model.CreditQuestion;
import com.model.InvalidQuestion;
import com.utils.QuestionValidator;
import com.utils.RomanValidator;

public class QuestionFactory {

	public static Question getQuestion(String question) {
		Question questionType = null;

		if (QuestionValidator.isUnitConversionQuestion(question)) {
			questionType = new UnitConversionQuestion(question);

		} else if (QuestionValidator.isCreditQuestion(question)) {
			questionType = new CreditQuestion(question);
		} else if (QuestionValidator.isMetalConversionQuestion(question)) {
			questionType = new MetalConversionQuestion(question);
		} else {

			questionType = new InvalidQuestion(question);

		}
		return questionType;
	}

}

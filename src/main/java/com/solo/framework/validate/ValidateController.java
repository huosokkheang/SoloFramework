package com.solo.framework.validate;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.collection.Solo;
import com.core.exception.business.SException;
import com.core.exception.business.SoloException;
import com.core.logger.SLog;
import com.core.util.validation.SValidatorUtil;

@RestController
@RequestMapping("/validate")
public class ValidateController {

	@PostMapping("/allowParameters")
	public Solo AllowParams(@RequestBody Solo params) throws SoloException {
		try {
			// Allow Parameters ="id", "name", "sex", "dob"
			Solo solo = new Solo();
			SValidatorUtil.allowParameters(params, "id", "name", "sex", "dob");
			solo.putAll(params);
			return solo;
		} catch (SException e) {
			SLog.err.print(e);
			throw e;
		}
	}

	@PostMapping("/validateRequiredAllParams")
	public Solo validateRequiredAllParams(@RequestBody Solo params) throws SoloException {
		try {
			// Required Parameters = "id", "name", "sex", "dob"
			Solo solo = new Solo();
			SValidatorUtil.validate(params, "id", "name", "sex", "dob");
			solo.putAll(params);
			return solo;
		} catch (SException e) {
			SLog.err.print(e);
			throw e;
		}
	}

	@PostMapping("/validateDateFormat")
	public Solo validateDateFormat(@RequestBody Solo params) throws SoloException {
		try {
			// Required Date Format Parameters = "dob", "bod"
			Solo solo = new Solo();
			SValidatorUtil.ValidateOnlyDate(params, "dd-MM-yyyy", "dob", "bod");
			solo.putAll(params);
			return solo;
		} catch (SException e) {
			SLog.err.print(e);
			throw e;
		}
	}

	@PostMapping("/validateInteger")
	public Solo validateInteger(@RequestBody Solo params) throws SoloException {
		try {
			// Required Parameters only Integer = "id", "phonenumber"
			Solo solo = new Solo();
			SValidatorUtil.ValidateOnlyInteger(params, "id", "phonenumber");
			solo.putAll(params);
			return solo;
		} catch (SException e) {
			SLog.err.print(e);
			throw e;
		}
	}

	@PostMapping("/validateFloat")
	public Solo validateFloat(@RequestBody Solo params) throws SoloException {
		try {
			// Required Parameters only Integer = "id", "phonenumber"
			Solo solo = new Solo();
			SValidatorUtil.ValidateOnlyFloat(params, "dd-MM-yyyy", "dob", "bod");
			solo.putAll(params);
			return solo;
		} catch (SException e) {
			SLog.err.print(e);
			throw e;
		}
	}

	@PostMapping("/validateEmail")
	public Solo validateEmail(@RequestBody Solo params) throws SoloException {
		try {
			Solo solo = new Solo();
			SValidatorUtil.ValidateOnlyEmail(params, "email");
			solo.putAll(params);
			return solo;
		} catch (SException e) {
			SLog.err.print(e);
			throw e;
		}
	}
	
	@PostMapping("/validateNumber")
	public Solo validateNumber(@RequestBody Solo params) throws SoloException {
		try {
			Solo solo = new Solo();
			SValidatorUtil.ValidateOnlyNumber(params, "number");
			solo.putAll(params);
			return solo;
		} catch (SException e) {
			SLog.err.print(e);
			throw e;
		}
	}
	
	@PostMapping("/validatePhoneNumber")
	public Solo validatePhoneNumber(@RequestBody Solo params) throws SoloException {
		try {
			Solo solo = new Solo();
			SValidatorUtil.ValidateOnlyPhoneNumber(params, "phonenumber");
			solo.putAll(params);
			return solo;
		} catch (SException e) {
			SLog.err.print(e);
			throw e;
		}
	}
	
	@PostMapping("/validateAnyKey")
	public Solo validateAnyKey(@RequestBody Solo params) throws SoloException {
		try {
			Solo solo = new Solo();
			SValidatorUtil.ValidateOnlyAnyKeyNoSymble(params, "anykey");
			solo.putAll(params);
			return solo;
		} catch (SException e) {
			SLog.err.print(e);
			throw e;
		}
	}
	
	@PostMapping("/validateNull")
	public Solo validateNull(@RequestBody Solo params) throws SoloException {
		try {
			Solo solo = new Solo();
			SValidatorUtil.validateNull(params, "id", "name");
			solo.putAll(params);
			return solo;
		} catch (SException e) {
			SLog.err.print(e);
			throw e;
		}
	}

}

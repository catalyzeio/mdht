/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivitySupply(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivityAct() <em>Get Plan Of Care Activity Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivityEncounter() <em>Get Plan Of Care Activity Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivityObservation() <em>Get Plan Of Care Activity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivityProcedure() <em>Get Plan Of Care Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivitySubstanceAdministration() <em>Get Plan Of Care Activity Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivitySupply() <em>Get Plan Of Care Activity Supply</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlanOfCareSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareSectionTemplateId() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionTemplateIdTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionTemplateId(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareSectionCode() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionCodeTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionCode(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionText() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionTextTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionText(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlanOfCareActivityAct() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionPlanOfCareActivityActTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionPlanOfCareActivityAct",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();
				PlanOfCareActivityAct ActivityAct = ConsolFactory.eINSTANCE.createPlanOfCareActivityAct();
				target.addAct(ActivityAct);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityAct(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivityActTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlanOfCareActivityEncounter() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionPlanOfCareActivityEncounterTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionPlanOfCareActivityEncounter",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();
				PlanOfCareActivityEncounter Actent = ConsolFactory.eINSTANCE.createPlanOfCareActivityEncounter();
				target.addEncounter(Actent);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityEncounter(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivityEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlanOfCareActivityObservation() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionPlanOfCareActivityObservationTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionPlanOfCareActivityObservation",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();
				PlanOfCareActivityObservation ActObs = ConsolFactory.eINSTANCE.createPlanOfCareActivityObservation();
				target.addObservation(ActObs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityObservation(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivityObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlanOfCareActivityProcedure() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionPlanOfCareActivityProcedureTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionPlanOfCareActivityProcedure",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();
				PlanOfCareActivityProcedure ActProc = ConsolFactory.eINSTANCE.createPlanOfCareActivityProcedure();
				target.addProcedure(ActProc);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityProcedure(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivityProcedureTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministrationTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();
				PlanOfCareActivitySubstanceAdministration ActObs = ConsolFactory.eINSTANCE.createPlanOfCareActivitySubstanceAdministration();
				target.addSubstanceAdministration(ActObs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministrationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlanOfCareActivitySupply() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionPlanOfCareActivitySupplyTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionPlanOfCareActivitySupply",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();
				PlanOfCareActivitySupply ActSupply = ConsolFactory.eINSTANCE.createPlanOfCareActivitySupply();
				target.addSupply(ActSupply);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivitySupply(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivitySupplyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareActivityAct() {

		PlanOfCareSection target = objectFactory.create();
		target.getPlanOfCareActivityAct();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareActivityEncounter() {

		PlanOfCareSection target = objectFactory.create();
		target.getPlanOfCareActivityEncounter();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareActivityObservation() {

		PlanOfCareSection target = objectFactory.create();
		target.getPlanOfCareActivityObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareActivityProcedure() {

		PlanOfCareSection target = objectFactory.create();
		target.getPlanOfCareActivityProcedure();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareActivitySubstanceAdministration() {

		PlanOfCareSection target = objectFactory.create();
		target.getPlanOfCareActivitySubstanceAdministration();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareActivitySupply() {

		PlanOfCareSection target = objectFactory.create();
		target.getPlanOfCareActivitySupply();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlanOfCareSectionOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<PlanOfCareSection> {
		public PlanOfCareSection create() {
			return ConsolFactory.eINSTANCE.createPlanOfCareSection();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends PlanOfCareSectionOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // PlanOfCareSectionOperations

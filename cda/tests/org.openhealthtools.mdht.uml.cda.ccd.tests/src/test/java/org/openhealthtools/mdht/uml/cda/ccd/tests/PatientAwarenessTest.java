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
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness;
import org.openhealthtools.mdht.uml.cda.ccd.operations.PatientAwarenessOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Patient Awareness</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness#validatePatientAwarenessParticipantRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Awareness Participant Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness#validatePatientAwarenessTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Awareness Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness#validatePatientAwarenessTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Awareness Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness#validatePatientAwarenessAwarenessCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Awareness Awareness Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientAwarenessTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidatePatientAwarenessParticipantRoleId() {
		OperationsTestCase<PatientAwareness> validatePatientAwarenessParticipantRoleIdTestCase = new OperationsTestCase<PatientAwareness>(
			"validatePatientAwarenessParticipantRoleId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_AWARENESS_PARTICIPANT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientAwareness target) {

			}

			@Override
			protected void updateToPass(PatientAwareness target) {
				target.init();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				II id = DatatypesFactory.eINSTANCE.createII();
				id.setRoot("s");
				pr.getIds().add(id);
				target.setParticipantRole(pr);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientAwarenessOperations.validatePatientAwarenessParticipantRoleId(
					(PatientAwareness) objectToTest, diagnostician, map);
			}

		};

		validatePatientAwarenessParticipantRoleIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePatientAwarenessTemplateId() {
		OperationsTestCase<PatientAwareness> validatePatientAwarenessTemplateIdTestCase = new OperationsTestCase<PatientAwareness>(
			"validatePatientAwarenessTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_AWARENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientAwareness target) {

			}

			@Override
			protected void updateToPass(PatientAwareness target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientAwarenessOperations.validatePatientAwarenessTemplateId(
					(PatientAwareness) objectToTest, diagnostician, map);
			}

		};

		validatePatientAwarenessTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePatientAwarenessTypeCode() {
		OperationsTestCase<PatientAwareness> validatePatientAwarenessTypeCodeTestCase = new OperationsTestCase<PatientAwareness>(
			"validatePatientAwarenessTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_AWARENESS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientAwareness target) {

			}

			@Override
			protected void updateToPass(PatientAwareness target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientAwarenessOperations.validatePatientAwarenessTypeCode(
					(PatientAwareness) objectToTest, diagnostician, map);
			}

		};

		validatePatientAwarenessTypeCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidatePatientAwarenessAwarenessCode() {
		OperationsTestCase<PatientAwareness> validatePatientAwarenessAwarenessCodeTestCase = new OperationsTestCase<PatientAwareness>(
			"validatePatientAwarenessAwarenessCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_AWARENESS_AWARENESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientAwareness target) {

			}

			@Override
			protected void updateToPass(PatientAwareness target) {
				target.init();
				target.setAwarenessCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientAwarenessOperations.validatePatientAwarenessAwarenessCode(
					(PatientAwareness) objectToTest, diagnostician, map);
			}

		};

		validatePatientAwarenessAwarenessCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends PatientAwarenessOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientAwareness> {
		public PatientAwareness create() {
			return CCDFactory.eINSTANCE.createPatientAwareness();
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
	private static class ConstructorTestClass extends PatientAwarenessOperations {
	}

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

} // PatientAwarenessOperations

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
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.operations.MedicationsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Medications Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection#validateMedicationsSectionHasMedicationOrSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Has Medication Or Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection#validateMedicationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection#validateMedicationsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection#validateMedicationsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection#validateMedicationsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection#validateMedicationsSectionMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection#validateMedicationsSectionSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection#getSupplyActivities() <em>Get Supply Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationsSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateMedicationsSectionHasMedicationOrSupplyActivity() {
		OperationsTestCase<MedicationsSection> validateMedicationsSectionHasMedicationOrSupplyActivityTestCase = new OperationsTestCase<MedicationsSection>(
			"validateMedicationsSectionHasMedicationOrSupplyActivity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {

			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				target.init();
				MedicationActivity sa = CCDFactory.eINSTANCE.createMedicationActivity();
				SupplyActivity sup = CCDFactory.eINSTANCE.createSupplyActivity();
				target.addSubstanceAdministration(sa);
				target.addSupply(sup);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionOperations.validateMedicationsSectionHasMedicationOrSupplyActivity(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionHasMedicationOrSupplyActivityTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationsSectionTemplateId() {
		OperationsTestCase<MedicationsSection> validateMedicationsSectionTemplateIdTestCase = new OperationsTestCase<MedicationsSection>(
			"validateMedicationsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {

			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionOperations.validateMedicationsSectionTemplateId(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationsSectionCode() {
		OperationsTestCase<MedicationsSection> validateMedicationsSectionCodeTestCase = new OperationsTestCase<MedicationsSection>(
			"validateMedicationsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {

			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionOperations.validateMedicationsSectionCode(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationsSectionTitle() {
		OperationsTestCase<MedicationsSection> validateMedicationsSectionTitleTestCase = new OperationsTestCase<MedicationsSection>(
			"validateMedicationsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {

			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionOperations.validateMedicationsSectionTitle(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionTitleTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationsSectionText() {
		OperationsTestCase<MedicationsSection> validateMedicationsSectionTextTestCase = new OperationsTestCase<MedicationsSection>(
			"validateMedicationsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {

			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionOperations.validateMedicationsSectionText(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationsSectionMedicationActivity() {
		OperationsTestCase<MedicationsSection> validateMedicationsSectionMedicationActivityTestCase = new OperationsTestCase<MedicationsSection>(
			"validateMedicationsSectionMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {

			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				target.init();
				target.addSubstanceAdministration(CCDFactory.eINSTANCE.createMedicationActivity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionOperations.validateMedicationsSectionMedicationActivity(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationsSectionSupplyActivity() {
		OperationsTestCase<MedicationsSection> validateMedicationsSectionSupplyActivityTestCase = new OperationsTestCase<MedicationsSection>(
			"validateMedicationsSectionSupplyActivity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {

			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				target.init();
				target.addSupply(CCDFactory.eINSTANCE.createSupplyActivity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionOperations.validateMedicationsSectionSupplyActivity(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionSupplyActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivities() {

		MedicationsSection target = objectFactory.create();
		target.getMedicationActivities();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSupplyActivities() {

		MedicationsSection target = objectFactory.create();
		target.getSupplyActivities();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends MedicationsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationsSection> {
		public MedicationsSection create() {
			return CCDFactory.eINSTANCE.createMedicationsSection();
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
	private static class ConstructorTestClass extends MedicationsSectionOperations {
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

} // MedicationsSectionOperations

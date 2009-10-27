/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveStatusObservation#AdvanceDirectiveStatusObservation_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Advance Directive Status Observation template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveStatusObservation#AdvanceDirectiveStatusObservation_value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Advance Directive Status Observation value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveStatusObservationOperations extends StatusObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveStatusObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #AdvanceDirectiveStatusObservation_templateId(AdvanceDirectiveStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Advance Directive Status Observation template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AdvanceDirectiveStatusObservation_templateId(AdvanceDirectiveStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ADVANCE_DIRECTIVE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.37')";

	/**
	 * The cached OCL invariant for the '{@link #AdvanceDirectiveStatusObservation_templateId(AdvanceDirectiveStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Advance Directive Status Observation template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AdvanceDirectiveStatusObservation_templateId(AdvanceDirectiveStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint ADVANCE_DIRECTIVE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.37')
	 * @param advanceDirectiveStatusObservation The receiving '<em><b>Advance Directive Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean AdvanceDirectiveStatusObservation_templateId(AdvanceDirectiveStatusObservation advanceDirectiveStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (ADVANCE_DIRECTIVE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ADVANCE_DIRECTIVE_STATUS_OBSERVATION);
			try {
				ADVANCE_DIRECTIVE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(ADVANCE_DIRECTIVE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(ADVANCE_DIRECTIVE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirectiveStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ADVANCE_DIRECTIVE_STATUS_OBSERVATION__ADVANCE_DIRECTIVE_STATUS_OBSERVATION_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("AdvanceDirectiveStatusObservation_templateId"),
						 new Object [] { advanceDirectiveStatusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #AdvanceDirectiveStatusObservation_value(AdvanceDirectiveStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Advance Directive Status Observation value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AdvanceDirectiveStatusObservation_value(AdvanceDirectiveStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ADVANCE_DIRECTIVE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->size() = 1 and self.value->forAll(element | element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.1.11.20.1')";

	/**
	 * The cached OCL invariant for the '{@link #AdvanceDirectiveStatusObservation_value(AdvanceDirectiveStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Advance Directive Status Observation value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AdvanceDirectiveStatusObservation_value(AdvanceDirectiveStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint ADVANCE_DIRECTIVE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.value->size() = 1 and self.value->forAll(element | element.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = element.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.1.11.20.1')
	 * @param advanceDirectiveStatusObservation The receiving '<em><b>Advance Directive Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean AdvanceDirectiveStatusObservation_value(AdvanceDirectiveStatusObservation advanceDirectiveStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (ADVANCE_DIRECTIVE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ADVANCE_DIRECTIVE_STATUS_OBSERVATION);
			try {
				ADVANCE_DIRECTIVE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(ADVANCE_DIRECTIVE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(ADVANCE_DIRECTIVE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirectiveStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ADVANCE_DIRECTIVE_STATUS_OBSERVATION__ADVANCE_DIRECTIVE_STATUS_OBSERVATION_VALUE,
						 CCDPlugin.INSTANCE.getString("AdvanceDirectiveStatusObservation_value"),
						 new Object [] { advanceDirectiveStatusObservation }));
			}
			return false;
		}
		return true;
	}

} // AdvanceDirectiveStatusObservationOperations
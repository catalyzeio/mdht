/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;
import org.openhealthtools.mdht.uml.hl7.rim.operations.ActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encompassing Encounter</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.EncompassingEncounter#validateClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.EncompassingEncounter#validateMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncompassingEncounterOperations extends ActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncompassingEncounterOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClassCode(EncompassingEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClassCode(EncompassingEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.isClassCodeDefined() implies self.classCode=vocab::ActClass::ENC";

	/**
	 * The cached OCL invariant for the '{@link #validateClassCode(EncompassingEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClassCode(EncompassingEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encompassingEncounter The receiving '<em><b>Encompassing Encounter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateClassCode(EncompassingEncounter encompassingEncounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.Literals.ENCOMPASSING_ENCOUNTER);
			try {
				VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encompassingEncounter)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CDAValidator.DIAGNOSTIC_SOURCE, CDAValidator.ENCOMPASSING_ENCOUNTER__CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"validateClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									encompassingEncounter, context) }), new Object[] { encompassingEncounter }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMoodCode(EncompassingEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMoodCode(EncompassingEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.isMoodCodeDefined() implies self.moodCode=vocab::ActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateMoodCode(EncompassingEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMoodCode(EncompassingEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encompassingEncounter The receiving '<em><b>Encompassing Encounter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMoodCode(EncompassingEncounter encompassingEncounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.Literals.ENCOMPASSING_ENCOUNTER);
			try {
				VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encompassingEncounter)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CDAValidator.DIAGNOSTIC_SOURCE, CDAValidator.ENCOMPASSING_ENCOUNTER__MOOD_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"validateMoodCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									encompassingEncounter, context) }), new Object[] { encompassingEncounter }));
			}
			return false;
		}
		return true;
	}

} // EncompassingEncounterOperations

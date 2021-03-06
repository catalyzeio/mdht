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
package org.openhealthtools.mdht.uml.cda.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.SpecimenRole;
import org.openhealthtools.mdht.uml.cda.operations.SpecimenRoleOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.rim.impl.RoleImpl;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassSpecimen;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SpecimenRoleImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SpecimenRoleImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SpecimenRoleImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SpecimenRoleImpl#getIds <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SpecimenRoleImpl#getSpecimenPlayingEntity <em>Specimen Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SpecimenRoleImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.SpecimenRoleImpl#getClassCode <em>Class Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecimenRoleImpl extends RoleImpl implements SpecimenRole {
	/**
	 * The cached value of the '{@link #getRealmCodes() <em>Realm Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealmCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CS> realmCodes;

	/**
	 * The cached value of the '{@link #getTypeId() <em>Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeId()
	 * @generated
	 * @ordered
	 */
	protected InfrastructureRootTypeId typeId;

	/**
	 * The cached value of the '{@link #getTemplateIds() <em>Template Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateIds()
	 * @generated
	 * @ordered
	 */
	protected EList<II> templateIds;

	/**
	 * The cached value of the '{@link #getIds() <em>Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds()
	 * @generated
	 * @ordered
	 */
	protected EList<II> ids;

	/**
	 * The cached value of the '{@link #getSpecimenPlayingEntity() <em>Specimen Playing Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenPlayingEntity()
	 * @generated
	 * @ordered
	 */
	protected PlayingEntity specimenPlayingEntity;

	/**
	 * The default value of the '{@link #getNullFlavor() <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullFlavor()
	 * @generated
	 * @ordered
	 */
	protected static final NullFlavor NULL_FLAVOR_EDEFAULT = NullFlavor.ASKU;

	/**
	 * The cached value of the '{@link #getNullFlavor() <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullFlavor()
	 * @generated
	 * @ordered
	 */
	protected NullFlavor nullFlavor = NULL_FLAVOR_EDEFAULT;

	/**
	 * This is true if the Null Flavor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nullFlavorESet;

	/**
	 * The default value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected static final RoleClassSpecimen CLASS_CODE_EDEFAULT = RoleClassSpecimen.SPEC;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected RoleClassSpecimen classCode = CLASS_CODE_EDEFAULT;

	/**
	 * This is true if the Class Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.SPECIMEN_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.SPECIMEN_ROLE__REALM_CODE);
		}
		return realmCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfrastructureRootTypeId getTypeId() {
		return typeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeId(InfrastructureRootTypeId newTypeId, NotificationChain msgs) {
		InfrastructureRootTypeId oldTypeId = typeId;
		typeId = newTypeId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SPECIMEN_ROLE__TYPE_ID, oldTypeId, newTypeId);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeId(InfrastructureRootTypeId newTypeId) {
		if (newTypeId != typeId) {
			NotificationChain msgs = null;
			if (typeId != null) {
				msgs = ((InternalEObject) typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SPECIMEN_ROLE__TYPE_ID, null, msgs);
			}
			if (newTypeId != null) {
				msgs = ((InternalEObject) newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SPECIMEN_ROLE__TYPE_ID, null, msgs);
			}
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SPECIMEN_ROLE__TYPE_ID, newTypeId, newTypeId));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<II> getTemplateIds() {
		if (templateIds == null) {
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.SPECIMEN_ROLE__TEMPLATE_ID);
		}
		return templateIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getIds() {
		if (ids == null) {
			ids = new EObjectContainmentEList<II>(II.class, this, CDAPackage.SPECIMEN_ROLE__ID);
		}
		return ids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayingEntity getSpecimenPlayingEntity() {
		return specimenPlayingEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecimenPlayingEntity(PlayingEntity newSpecimenPlayingEntity,
			NotificationChain msgs) {
		PlayingEntity oldSpecimenPlayingEntity = specimenPlayingEntity;
		specimenPlayingEntity = newSpecimenPlayingEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.SPECIMEN_ROLE__SPECIMEN_PLAYING_ENTITY, oldSpecimenPlayingEntity,
				newSpecimenPlayingEntity);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecimenPlayingEntity(PlayingEntity newSpecimenPlayingEntity) {
		if (newSpecimenPlayingEntity != specimenPlayingEntity) {
			NotificationChain msgs = null;
			if (specimenPlayingEntity != null) {
				msgs = ((InternalEObject) specimenPlayingEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SPECIMEN_ROLE__SPECIMEN_PLAYING_ENTITY, null, msgs);
			}
			if (newSpecimenPlayingEntity != null) {
				msgs = ((InternalEObject) newSpecimenPlayingEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.SPECIMEN_ROLE__SPECIMEN_PLAYING_ENTITY, null, msgs);
			}
			msgs = basicSetSpecimenPlayingEntity(newSpecimenPlayingEntity, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SPECIMEN_ROLE__SPECIMEN_PLAYING_ENTITY, newSpecimenPlayingEntity,
				newSpecimenPlayingEntity));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullFlavor getNullFlavor() {
		return nullFlavor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullFlavor(NullFlavor newNullFlavor) {
		NullFlavor oldNullFlavor = nullFlavor;
		nullFlavor = newNullFlavor == null
				? NULL_FLAVOR_EDEFAULT
				: newNullFlavor;
		boolean oldNullFlavorESet = nullFlavorESet;
		nullFlavorESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SPECIMEN_ROLE__NULL_FLAVOR, oldNullFlavor, nullFlavor,
				!oldNullFlavorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNullFlavor() {
		NullFlavor oldNullFlavor = nullFlavor;
		boolean oldNullFlavorESet = nullFlavorESet;
		nullFlavor = NULL_FLAVOR_EDEFAULT;
		nullFlavorESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.SPECIMEN_ROLE__NULL_FLAVOR, oldNullFlavor, NULL_FLAVOR_EDEFAULT,
				oldNullFlavorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNullFlavor() {
		return nullFlavorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleClassSpecimen getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(RoleClassSpecimen newClassCode) {
		RoleClassSpecimen oldClassCode = classCode;
		classCode = newClassCode == null
				? CLASS_CODE_EDEFAULT
				: newClassCode;
		boolean oldClassCodeESet = classCodeESet;
		classCodeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.SPECIMEN_ROLE__CLASS_CODE, oldClassCode, classCode,
				!oldClassCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassCode() {
		RoleClassSpecimen oldClassCode = classCode;
		boolean oldClassCodeESet = classCodeESet;
		classCode = CLASS_CODE_EDEFAULT;
		classCodeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.SPECIMEN_ROLE__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT,
				oldClassCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClassCode() {
		return classCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenRoleOperations.validateClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.SPECIMEN_ROLE__REALM_CODE:
				return ((InternalEList<?>) getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.SPECIMEN_ROLE__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.SPECIMEN_ROLE__TEMPLATE_ID:
				return ((InternalEList<?>) getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.SPECIMEN_ROLE__ID:
				return ((InternalEList<?>) getIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.SPECIMEN_ROLE__SPECIMEN_PLAYING_ENTITY:
				return basicSetSpecimenPlayingEntity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDAPackage.SPECIMEN_ROLE__REALM_CODE:
				return getRealmCodes();
			case CDAPackage.SPECIMEN_ROLE__TYPE_ID:
				return getTypeId();
			case CDAPackage.SPECIMEN_ROLE__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.SPECIMEN_ROLE__ID:
				return getIds();
			case CDAPackage.SPECIMEN_ROLE__SPECIMEN_PLAYING_ENTITY:
				return getSpecimenPlayingEntity();
			case CDAPackage.SPECIMEN_ROLE__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.SPECIMEN_ROLE__CLASS_CODE:
				return getClassCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CDAPackage.SPECIMEN_ROLE__REALM_CODE:
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>) newValue);
				return;
			case CDAPackage.SPECIMEN_ROLE__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) newValue);
				return;
			case CDAPackage.SPECIMEN_ROLE__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>) newValue);
				return;
			case CDAPackage.SPECIMEN_ROLE__ID:
				getIds().clear();
				getIds().addAll((Collection<? extends II>) newValue);
				return;
			case CDAPackage.SPECIMEN_ROLE__SPECIMEN_PLAYING_ENTITY:
				setSpecimenPlayingEntity((PlayingEntity) newValue);
				return;
			case CDAPackage.SPECIMEN_ROLE__NULL_FLAVOR:
				setNullFlavor((NullFlavor) newValue);
				return;
			case CDAPackage.SPECIMEN_ROLE__CLASS_CODE:
				setClassCode((RoleClassSpecimen) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CDAPackage.SPECIMEN_ROLE__REALM_CODE:
				getRealmCodes().clear();
				return;
			case CDAPackage.SPECIMEN_ROLE__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) null);
				return;
			case CDAPackage.SPECIMEN_ROLE__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.SPECIMEN_ROLE__ID:
				getIds().clear();
				return;
			case CDAPackage.SPECIMEN_ROLE__SPECIMEN_PLAYING_ENTITY:
				setSpecimenPlayingEntity((PlayingEntity) null);
				return;
			case CDAPackage.SPECIMEN_ROLE__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.SPECIMEN_ROLE__CLASS_CODE:
				unsetClassCode();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CDAPackage.SPECIMEN_ROLE__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.SPECIMEN_ROLE__TYPE_ID:
				return typeId != null;
			case CDAPackage.SPECIMEN_ROLE__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.SPECIMEN_ROLE__ID:
				return ids != null && !ids.isEmpty();
			case CDAPackage.SPECIMEN_ROLE__SPECIMEN_PLAYING_ENTITY:
				return specimenPlayingEntity != null;
			case CDAPackage.SPECIMEN_ROLE__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.SPECIMEN_ROLE__CLASS_CODE:
				return isSetClassCode();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nullFlavor: ");
		if (nullFlavorESet) {
			result.append(nullFlavor);
		} else {
			result.append("<unset>");
		}
		result.append(", classCode: ");
		if (classCodeESet) {
			result.append(classCode);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // SpecimenRoleImpl

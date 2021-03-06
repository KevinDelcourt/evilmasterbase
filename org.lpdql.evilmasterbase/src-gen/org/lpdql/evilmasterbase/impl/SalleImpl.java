/**
 */
package org.lpdql.evilmasterbase.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lpdql.evilmasterbase.Escouade;
import org.lpdql.evilmasterbase.EvilmasterbasePackage;
import org.lpdql.evilmasterbase.Piege;
import org.lpdql.evilmasterbase.Salle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Salle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.evilmasterbase.impl.SalleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.SalleImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.SalleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.SalleImpl#getEscouade <em>Escouade</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.SalleImpl#getPiege <em>Piege</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalleImpl extends MinimalEObjectImpl.Container implements Salle {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEscouade() <em>Escouade</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscouade()
	 * @generated
	 * @ordered
	 */
	protected EList<Escouade> escouade;

	/**
	 * The cached value of the '{@link #getPiege() <em>Piege</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiege()
	 * @generated
	 * @ordered
	 */
	protected EList<Piege> piege;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvilmasterbasePackage.Literals.SALLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.SALLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.SALLE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.SALLE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Escouade> getEscouade() {
		if (escouade == null) {
			escouade = new EObjectContainmentEList<Escouade>(Escouade.class, this,
					EvilmasterbasePackage.SALLE__ESCOUADE);
		}
		return escouade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Piege> getPiege() {
		if (piege == null) {
			piege = new EObjectContainmentEList<Piege>(Piege.class, this, EvilmasterbasePackage.SALLE__PIEGE);
		}
		return piege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EvilmasterbasePackage.SALLE__ESCOUADE:
			return ((InternalEList<?>) getEscouade()).basicRemove(otherEnd, msgs);
		case EvilmasterbasePackage.SALLE__PIEGE:
			return ((InternalEList<?>) getPiege()).basicRemove(otherEnd, msgs);
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
		case EvilmasterbasePackage.SALLE__NAME:
			return getName();
		case EvilmasterbasePackage.SALLE__PRICE:
			return getPrice();
		case EvilmasterbasePackage.SALLE__DESCRIPTION:
			return getDescription();
		case EvilmasterbasePackage.SALLE__ESCOUADE:
			return getEscouade();
		case EvilmasterbasePackage.SALLE__PIEGE:
			return getPiege();
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
		case EvilmasterbasePackage.SALLE__NAME:
			setName((String) newValue);
			return;
		case EvilmasterbasePackage.SALLE__PRICE:
			setPrice((Integer) newValue);
			return;
		case EvilmasterbasePackage.SALLE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case EvilmasterbasePackage.SALLE__ESCOUADE:
			getEscouade().clear();
			getEscouade().addAll((Collection<? extends Escouade>) newValue);
			return;
		case EvilmasterbasePackage.SALLE__PIEGE:
			getPiege().clear();
			getPiege().addAll((Collection<? extends Piege>) newValue);
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
		case EvilmasterbasePackage.SALLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EvilmasterbasePackage.SALLE__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case EvilmasterbasePackage.SALLE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case EvilmasterbasePackage.SALLE__ESCOUADE:
			getEscouade().clear();
			return;
		case EvilmasterbasePackage.SALLE__PIEGE:
			getPiege().clear();
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
		case EvilmasterbasePackage.SALLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EvilmasterbasePackage.SALLE__PRICE:
			return price != PRICE_EDEFAULT;
		case EvilmasterbasePackage.SALLE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case EvilmasterbasePackage.SALLE__ESCOUADE:
			return escouade != null && !escouade.isEmpty();
		case EvilmasterbasePackage.SALLE__PIEGE:
			return piege != null && !piege.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", price: ");
		result.append(price);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SalleImpl

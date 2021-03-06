/**
 */
package com.tibco.bw.palette.zendesk.model.zendesk.util;

import com.tibco.bw.palette.zendesk.model.zendesk.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage
 * @generated
 */
public class ZendeskAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ZendeskPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZendeskAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ZendeskPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZendeskSwitch<Adapter> modelSwitch =
		new ZendeskSwitch<Adapter>() {
			@Override
			public Adapter caseCreateTicket(CreateTicket object) {
				return createCreateTicketAdapter();
			}
			@Override
			public Adapter caseCreateUser(CreateUser object) {
				return createCreateUserAdapter();
			}
			@Override
			public Adapter caseUpdateTicket(UpdateTicket object) {
				return createUpdateTicketAdapter();
			}
			@Override
			public Adapter caseDelete(Delete object) {
				return createDeleteAdapter();
			}
			@Override
			public Adapter caseGetTicketMetrics(GetTicketMetrics object) {
				return createGetTicketMetricsAdapter();
			}
			@Override
			public Adapter caseSearch(Search object) {
				return createSearchAdapter();
			}
			@Override
			public Adapter caseGetTickets(GetTickets object) {
				return createGetTicketsAdapter();
			}
			@Override
			public Adapter caseGetUsers(GetUsers object) {
				return createGetUsersAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket <em>Create Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket
	 * @generated
	 */
	public Adapter createCreateTicketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateUser <em>Create User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.CreateUser
	 * @generated
	 */
	public Adapter createCreateUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket <em>Update Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket
	 * @generated
	 */
	public Adapter createUpdateTicketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tibco.bw.palette.zendesk.model.zendesk.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.Delete
	 * @generated
	 */
	public Adapter createDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics <em>Get Ticket Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics
	 * @generated
	 */
	public Adapter createGetTicketMetricsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tibco.bw.palette.zendesk.model.zendesk.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.Search
	 * @generated
	 */
	public Adapter createSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTickets <em>Get Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.GetTickets
	 * @generated
	 */
	public Adapter createGetTicketsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tibco.bw.palette.zendesk.model.zendesk.GetUsers <em>Get Users</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.GetUsers
	 * @generated
	 */
	public Adapter createGetUsersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ZendeskAdapterFactory

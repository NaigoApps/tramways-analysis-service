/* tslint:disable */
/* eslint-disable */
/**
 * Tramways Analysis API
 * Tramways Analysis API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import { AnalysisStatus } from './analysis-status';

/**
 * 
 * @export
 * @interface AnalysisDescription
 */
export interface AnalysisDescription {
    /**
     * 
     * @type {string}
     * @memberof AnalysisDescription
     */
    'uuid'?: string;
    /**
     * 
     * @type {string}
     * @memberof AnalysisDescription
     */
    'name'?: string;
    /**
     * 
     * @type {AnalysisStatus}
     * @memberof AnalysisDescription
     */
    'status'?: AnalysisStatus;
}


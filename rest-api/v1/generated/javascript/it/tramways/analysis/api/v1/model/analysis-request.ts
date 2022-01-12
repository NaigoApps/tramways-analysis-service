/* tslint:disable */
/* eslint-disable */
/**
 * Tramways Analysis API
 * Tramways Analysis API
 *
 * The version of the OpenAPI document: 1.0.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import { Property } from './property';

/**
 * 
 * @export
 * @interface AnalysisRequest
 */
export interface AnalysisRequest {
    /**
     * 
     * @type {string}
     * @memberof AnalysisRequest
     */
    'projectId'?: string;
    /**
     * 
     * @type {string}
     * @memberof AnalysisRequest
     */
    'mapId'?: string;
    /**
     * 
     * @type {string}
     * @memberof AnalysisRequest
     */
    'analysisTypeId'?: string;
    /**
     * 
     * @type {Array<Property>}
     * @memberof AnalysisRequest
     */
    'parameters'?: Array<Property>;
}


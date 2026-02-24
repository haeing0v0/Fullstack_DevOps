import {useCallback} from 'react'
import {useSelector, useDispatch} from 'react-redux'
import type {AppState} from '../store'
import {Title} from '../components'
import {Button} from '../theme/daisyui'
import * as L from '../store/loading'

export default function LoadingTest() {
  const dispatch = useDispatch()
  const loading = useSelector<AppState, L.State>(({loading}) => loading)

  const doTimedLoading = useCallback(() => {
    dispatch<any>(L.doTimedLoading(1000))
  }, [dispatch])

  return (
    <section className="relative mt-4">
      <Title>LoadingTest</Title>
      <div className="mt-4">
        <div className="flex justify-center mt-4">
          <Button
            className="btn-sm btn-primary"
            onClick={doTimedLoading}
            disabled={loading}>
            DO TIMED LOADING
          </Button>
        </div>
        {loading && (
          <div className="absolute transform -translate-x-1/2 -translate-y-1/2 top-1/2 left-1/2">
            {' '}
            <Button className="btn-circle loading"></Button>
          </div>
        )}
      </div>
    </section>
  )
}
